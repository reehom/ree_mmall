package com.mmall.service.impl;

import com.google.common.collect.Lists;
import com.mmall.service.FileService;
import com.mmall.util.FTPUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;


@Service
public class FileServiceImpl  implements FileService{

    private Logger logger = LoggerFactory.getLogger(FileServiceImpl.class);

    public String upload(MultipartFile file,String path)  {
        String fileName = file.getOriginalFilename();
        //取后缀 扩展名
        String fileExtensionName = fileName.substring(fileName.lastIndexOf(".")+1);
        //新建文件名称 防止重复
        String uploadFileName = UUID.randomUUID().toString()+"."+fileExtensionName;
        logger.info("开始上传文件,上传文件名为:{},上传路径为:{}，新文件名:{}",fileName,path,uploadFileName);
        File  fileDir = new File(path);
        if(!fileDir.exists()){
            fileDir.setWritable(true);
            fileDir.mkdirs();
        }
        File targetFile = new File(path,uploadFileName);
        try {
            file.transferTo(targetFile);

            //将targetFile上传到FTP服务器
            FTPUtil.uploadFile(Lists.newArrayList(targetFile));
            //上传完之后 删除upload下面的文件
            targetFile.delete();

        } catch (IOException e) {
            logger.error("上传文件异常",e);
        }

        return targetFile.getName();

    }
}