package com.example.test;




import com.example.test.model.Player;

import com.example.test.service.CurrencieService;
import com.example.test.service.ItemService;
import com.example.test.service.PlayerService;
import com.example.test.service.ProgressService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;



@Controller
public class GreetingController {
    @Autowired
    private PlayerService playerService;
    @Autowired
    private CurrencieService currencieService;
    @Autowired
    private ItemService itemService;
    @Autowired
    private ProgressService progressService;


    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World") String name,
            Map<String, Object> model
    ) {
        model.put("name", name);
        return "greeting";
    }





    @PostMapping("start")
    public void start() throws IOException {
        List<Player> players =
                new ObjectMapper().readValue(
                        new FileInputStream(
                                new File("players.json")
                        ),
                        new TypeReference<List<Player>>() {}
                );

        for (Player player:players) {
            playerService.save(player);
        }
        System.out.println(players);

    }











    @GetMapping
    public String test(Map<String, Object> model) {
        Iterable<Player> players = playerService.findAll();

        model.put("players", players);

        return "test";
    }

    @PostMapping("find")
    public String find(@RequestParam String nickname, Map<String, Object> model) {
        Iterable<Player> players;

        if (nickname != null && !nickname.isEmpty()) {
            players = playerService.findByNickname(nickname);
        } else {
            players = playerService.findAll();
        }

        model.put("players", players);

        return "test";
    }
}
