package com.example.demo.enity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private Long userId;
    private String phone;
    private String password;
    private String salt;
    private String nickname;
    private Integer state;
    private Date creatTime;
    private Date updateTime;
}

