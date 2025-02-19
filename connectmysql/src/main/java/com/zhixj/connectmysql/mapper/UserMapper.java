package com.zhixj.connectmysql.mapper;

import com.zhixj.connectmysql.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: zhi_xj
 * @DateTime: 2025/2/13 14:15
 * @Description: TODO
 **/
@Repository
@Mapper
public interface UserMapper {

    List<User> queryAllUsers();
}
