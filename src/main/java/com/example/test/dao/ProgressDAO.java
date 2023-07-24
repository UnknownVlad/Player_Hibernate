package com.example.test.dao;


import com.example.test.model.Progress;
import org.springframework.data.repository.CrudRepository;

public interface ProgressDAO extends CrudRepository<Progress, Long> {
}
