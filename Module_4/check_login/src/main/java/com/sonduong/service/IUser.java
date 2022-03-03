package com.sonduong.service;

import com.sonduong.model.Login;
import com.sonduong.model.User;
import org.springframework.stereotype.Service;

@Service
public interface IUser {
      User checkLogin(Login login);
}
