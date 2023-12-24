package com.example.demo.service.impl;

import com.example.demo.dto.UserDTO;
import com.example.demo.enity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.example.demo.utils.MD5Util;
import com.example.demo.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean reg(UserDTO UserDto) {
        User user = new User();
        user.setPhone(UserDto.getPhone());
//密码现在是明文的 需要加密
        user.setPassword(UserDto.getPassword());
        //获取盐值
        String salt = StringUtil.randomNumber(6);
//将盐值 赋值给user
        user.setSalt(salt);
        //密码加密
        String md5 = MD5Util.getMD5(UserDto.getPassword(), salt, 10);
//加密之后的密码
        user.setPassword(md5);
//将当前时间赋值给user对象
        user.setCreatTime(new Date());
        user.setState(0);
        int i = userMapper.insertUser(user);
        return i > 0;
    }

    @Override
    public String login(UserDTO userDTO) {
        //目前第一步 能不能从user DTO里面出手机
        String phone = userDTO.getPhone();
        User user = userMapper.selectUserByPhone(phone);
        if (user == null) {
            throw new RuntimeException("手机号或者密码错误");
        }
        //用户输入的明文密码 MD5不可逆算方法 所以 用相同的salt 加相同加密次数  对用户输入密码进行加密 进行比对
        String md5 = MD5Util.getMD5(userDTO.getPassword(), user.getSalt(), 10);
        if (!user.getPassword().equals(md5)) {
            throw new RuntimeException();

        }
        return "登录成功";
    }

}
