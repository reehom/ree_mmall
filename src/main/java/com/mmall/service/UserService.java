package com.mmall.service;

import com.mmall.commons.ServerResponse;
import com.mmall.pojo.User;

public interface UserService {

    public ServerResponse<User> login(String username, String password);

    public ServerResponse<String> register(User user);

    public ServerResponse<String> checkValid(String str,String type);

    public ServerResponse<String> selectQuestion(String username);

    public ServerResponse<String> forgetCheckAnswer(String username,String question,String answer);

    public ServerResponse<String> forgetResetPassword(String username,String passwordNew,String forgetToken);

    public ServerResponse<String> resetPassword(String passwordOld,String passwordNew,User user);

    public ServerResponse<User> updateInformation(User user);

    public ServerResponse<User> getInformation(Integer userId);




}
