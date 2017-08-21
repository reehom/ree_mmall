package com.mmall.dao;

import org.apache.ibatis.annotations.Param;
import com.mmall.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int checkUsername(String username);

    int checkEmail(String email);

    User selectLogin(@Param("username")String username, @Param("password")String password);


    String selectQuestionByUsername(String username);

    int CheckAnswer(@Param("username") String usernamem,@Param("question") String question,@Param("answer")String answer);

    int updatePasswordByUsername(@Param("username")String username,@Param("password")String password);

    int checkPassword(@Param("password") String password,@Param("userId") int userId);

    int checkEmailByUserId(@Param("email")String email,@Param("userId")int userId);

}