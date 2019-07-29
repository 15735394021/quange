package com.example.demo.controller;


import com.example.demo.entity.Game;
import com.example.demo.entity.Result;
import com.example.demo.entity.Users;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class UserController {
    int index=1;
    @Autowired
    UserService userService;

    @RequestMapping("/getUser")
    public Result getUser(){
        Result result=new Result();
        result.setCode("200");
        result.setMessage("success");
        Users user = new Users();
        user.setCreate_time(new Date());
        user.setId(1);
        user.setUname("狗子");
        user.setStatus("1");
        user.setGold(100);
        result.setDate(user);
        return result;
    }
    @RequestMapping("/getUsers")
    public List<Users> getUsers(){
        return userService.getUsers() ;
    }

    @RequestMapping(value="/getUserById/{name}",produces = "application/json;charset=UTF-8")
    @ResponseBody
    @CrossOrigin
    public Map getUserById(@PathVariable String name){
        Map map =  userService.getUserById(name);
        try {
            if(map.size() != 0){
                return map;
            }
        }catch (NullPointerException e){
            insert(name);
        }
        return userService.getUserById(name);
    }
    @RequestMapping("updateCheck/{name}")
    public int update(@PathVariable String name){
//        index++;
//        return index;
        return userService.update(name);
    }
    @RequestMapping("deleteUser/{id}")
    public int delete(@PathVariable int id){
        return userService.delete(id);
    }

    @RequestMapping("insertUser/{name}")
    public void insert(@PathVariable String name){
        int i = userService.insert(name);
    }
}





