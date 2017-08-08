package com.mmall.controller.backend;

import com.mmall.commons.Const;
import com.mmall.commons.ServerResponse;
import com.mmall.pojo.User;
import com.mmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/manager/user")
public class UserManagerController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    public ServerResponse<User> login(String username, String password, HttpSession session){
        ServerResponse<User> response = userService.login(username,password);
        if(response.isSuccess()){
            User user =response.getData();
            if(user.getRole() == Const.Role.ROLE_ADMIN){
                session.setAttribute(Const.CURRENT_USER,user);
            }else{
                return ServerResponse.createByErrorMessage("当前用户不是管理员 无法登陆");
            }

        }
        return response;

    }
}
