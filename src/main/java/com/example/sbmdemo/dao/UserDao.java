package com.example.sbmdemo.dao;


import com.example.sbmdemo.dao.db.UserMapper;
import com.example.sbmdemo.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
    @Autowired
    private UserMapper userMapper;

    public  UserInfo findUserById(Integer id)throws Exception{
        return userMapper.findUserById(id);


    }
}
