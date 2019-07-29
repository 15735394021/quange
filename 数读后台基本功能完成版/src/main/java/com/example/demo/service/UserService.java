package com.example.demo.service;

import com.example.demo.entity.Users;

import java.util.List;
import java.util.Map;


public interface UserService {
    public Map getUserById(String name);
    public List<Users> getUsers();
    public int update(String name);
    public int delete(int id);
    public int insert(String name);
}
