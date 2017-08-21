package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {
    public String upload(MultipartFile file, String path);
}
