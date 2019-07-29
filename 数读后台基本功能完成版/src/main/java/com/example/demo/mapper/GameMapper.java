package com.example.demo.mapper;

import com.example.demo.entity.Game;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GameMapper {
    public Game getGame(int id);

}
