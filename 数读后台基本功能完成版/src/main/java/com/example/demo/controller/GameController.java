package com.example.demo.controller;

import com.example.demo.entity.Game;
import com.example.demo.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GameController {
    @Autowired
    GameService gameService;

    @RequestMapping("/getGameById/{id}")
    @CrossOrigin
    public Game getUserById(@PathVariable int id){
        return gameService.getGameById(id);
    }
}
