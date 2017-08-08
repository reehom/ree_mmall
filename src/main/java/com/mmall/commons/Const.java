package com.mmall.commons;

public class Const {
    public static final String CURRENT_USER = "current_user";
    public static final String EMAIL="email";
    public static final String USERNAME="username";


    public interface Role{
        int ROLE_CUSTOMER = 0;//0 为 普通用户
        int ROLE_ADMIN = 1;//1为管理员
    }

}
