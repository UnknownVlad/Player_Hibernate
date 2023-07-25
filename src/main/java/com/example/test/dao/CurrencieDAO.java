package com.example.test.dao;


import com.example.test.model.Currencie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CurrencieDAO  extends CrudRepository<Currencie, Long> {
    //List<Currencie> findByTag(String tag);

    /*@Query(value = "SELECT * FROM message m WHERE m.tag = :tag", nativeQuery = true)
    List<Message> mysearch(@Param("tag") String tag);*/

}
