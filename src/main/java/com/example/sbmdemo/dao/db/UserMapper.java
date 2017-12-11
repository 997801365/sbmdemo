package com.example.sbmdemo.dao.db;


import com.example.sbmdemo.vo.UserInfo;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {
    public UserInfo findUserById(Integer id);

}
