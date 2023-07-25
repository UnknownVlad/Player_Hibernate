package com.example.test.controller;

import com.example.test.model.Player;
import com.example.test.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping
    public String allPlayers(Map<String, Object> model) {
        Iterable<Player> players = playerService.findAll();

        model.put("players", players);

        return "main_page";
    }

    @PostMapping("find")
    public String findPlayers(@RequestParam String nickname, Map<String, Object> model){
        Iterable<Player> players;
        if(nickname != null && !nickname.isEmpty()){
            players = playerService.findByNickname(nickname);
        }else {
            players = playerService.findAll();
        }
        model.put("players", players);
        return "main_page";
    }

    @PostMapping("add")
    public String addPlayers(@RequestParam String nickname, Map<String, Object> model){
        Player player = new Player(nickname);
        playerService.save(player);
        Iterable<Player> players = playerService.findAll();
        model.put("players", players);
        return "main_page";
    }
    /*@PostMapping
    public String add(@RequestParam String nickname, Map<String, Object> model) {
        Player player = new Player(nickname);

        playerService.save(player);

        Iterable<Player> players = playerService.findAll();

        model.put("players", players);

        return "main_page";
    }*/
}
