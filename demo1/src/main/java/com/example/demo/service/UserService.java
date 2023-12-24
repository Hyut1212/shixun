package com.example.demo.service;

import com.example.demo.dto.UserDTO;

//@Service
public interface UserService {
    boolean reg(UserDTO userDTO);
    String login(UserDTO userDTO) ;
}
