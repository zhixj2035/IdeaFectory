package com.zhixj.connectmysql.service;

import com.zhixj.connectmysql.domain.User;
import com.zhixj.connectmysql.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhi_xj
 * @DateTime: 2025/2/13 14:15
 * @Description: TODO
 **/
@Service
public class UserService {

    @Autowired
    public UserMapper usermapper;

    public List<User> queryAllUsers() {
        return usermapper.queryAllUsers();
    }
}
