package com.example.demo.service.impl;

import com.example.demo.entity.Game;
import com.example.demo.entity.User;
import com.example.demo.entity.Users;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public Map getUserById(String name){
        return userMapper.getUser(name);
    }

    @Override
    public List<Users> getUsers() {
        return userMapper.getUsers();
    }

    public int update(String name){
        return userMapper.update(name);
    }

    @Override
    public int delete(int id) {
        return userMapper.delete(id);
    }

    @Override
    public int insert(String name){
        return userMapper.insert(name);
    }
}
