package com.example.test.dao;

import com.example.test.model.Currencie;
import com.example.test.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemDAO extends CrudRepository<Item, Long> {
}
