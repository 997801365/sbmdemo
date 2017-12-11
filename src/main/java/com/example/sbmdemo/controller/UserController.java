package com.example.sbmdemo.controller;


import com.example.sbmdemo.dao.UserDao;
import com.example.sbmdemo.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @PostMapping("/findUser")
    public UserInfo findUserById(@RequestParam(value="id") Integer id){

        UserInfo userInfo = null;
        try {
            userInfo = userDao.findUserById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return userInfo;

    }


}
