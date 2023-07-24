package com.example.test.service;

import com.example.test.dao.ItemDAO;
import com.example.test.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemService {
    @Autowired
    private ItemDAO itemDAO;
    public Optional<Item> findById(Long id){
        return itemDAO.findById(id);
    }

    public void save(Item item){
        itemDAO.save(item);
    }
}
