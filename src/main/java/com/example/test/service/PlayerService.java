package com.example.test.service;

import com.example.test.dao.PlayerDAO;
import com.example.test.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerService {
    @Autowired
    private PlayerDAO playerDAO;
    public Iterable<Player> findAll(){
        return playerDAO.findAll();
    }

    public Iterable<Player> findByNickname(String nickname){
        return playerDAO.findByNickname(nickname);
    }
    public Optional<Player> findById(Long id){
        return playerDAO.findById(id);
    }

    public void save(Player player){
        playerDAO.save(player);
    }
}
