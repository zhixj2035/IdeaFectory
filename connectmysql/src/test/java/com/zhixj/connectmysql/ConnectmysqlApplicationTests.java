package com.zhixj.connectmysql;

import com.zhixj.connectmysql.domain.User;
import com.zhixj.connectmysql.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ConnectmysqlApplicationTests {

    @Autowired
    public UserService userService;

    @Test
    void contextLoads() {
    }

    @Test
    void getUser() {
        List<User> userList= userService.queryAllUsers();

        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));
        }

    }


}
