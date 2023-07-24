package com.example.test.service;

import com.example.test.dao.CurrencieDAO;
import com.example.test.model.Currencie;
import com.example.test.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CurrencieService {

    @Autowired
    private CurrencieDAO currencieDAO;

    public Optional<Currencie> findById(Long id){
        return currencieDAO.findById(id);
    }

    public void save(Currencie currencie){
        currencieDAO.save(currencie);
    }

}
