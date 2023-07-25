package com.example.test.dao;


import com.example.test.model.Player;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerDAO extends CrudRepository<Player, Long> {

    Iterable<Player> findByNickname(String nickname);


}
