package com.zhixj.connectmysql.controller;

import com.zhixj.connectmysql.domain.User;
import com.zhixj.connectmysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zhi_xj
 * @DateTime: 2025/2/13 14:15
 * @Description: TODO
 **/
@RestController
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/query")
    public List<User> queryAllUsers() {
        return userService.queryAllUsers();
    }

}
