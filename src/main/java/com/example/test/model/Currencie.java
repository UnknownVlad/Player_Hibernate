package com.example.test.model;

import javax.persistence.*;

@Entity
@Table(name = "currencie")
public class Currencie {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    private Integer playerId;

    private Integer resourceId;

    private String name;

    private Integer count;

    public Currencie() {
    }

    public Currencie(Integer id, Integer playerId, Integer resourceId, String name, Integer count) {
        this.id = id;
        this.playerId = playerId;
        this.resourceId = resourceId;
        this.name = name;
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
