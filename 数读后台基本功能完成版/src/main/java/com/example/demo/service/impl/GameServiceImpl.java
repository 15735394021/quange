package com.example.demo.service.impl;

import com.example.demo.entity.Game;
import com.example.demo.mapper.GameMapper;
import com.example.demo.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    GameMapper gameMapper;
    @Override
    public Game getGameById(int id) {
        return gameMapper.getGame(id);
    }
}
