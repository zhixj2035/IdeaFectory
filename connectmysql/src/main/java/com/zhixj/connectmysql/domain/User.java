package com.zhixj.connectmysql.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author: zhi_xj
 * @DateTime: 2025/2/13 14:04
 * @Description: TODO
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private int userId;
    private String userName;
    private char male;
    private int age;
    private String address;
    private String schoolId;
    private int masterId;
    private String grade_class;

}
