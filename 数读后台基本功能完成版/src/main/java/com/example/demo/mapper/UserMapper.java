package com.example.demo.mapper;

import com.example.demo.entity.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    public Map getUser(String name);

    public List<Users> getUsers();

    public int update(String name);

    public int delete(int id);

    public int insert(String name);
}
