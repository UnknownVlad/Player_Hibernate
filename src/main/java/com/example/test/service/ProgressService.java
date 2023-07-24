package com.example.test.service;

import com.example.test.dao.ProgressDAO;
import com.example.test.model.Progress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProgressService {
    @Autowired
    private ProgressDAO progressDAO;
    public Optional<Progress> findById(Long id){
        return progressDAO.findById(id);
    }

    public void save(Progress progress){
        progressDAO.save(progress);
    }
}
