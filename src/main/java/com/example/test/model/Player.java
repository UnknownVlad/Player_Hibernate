package com.example.test.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer playerId;
    private String nickname;


    //@Transient
    @OneToMany(cascade = CascadeType.ALL)
    private List<Progress> progresses;
    //@Transient
    @OneToMany(cascade = CascadeType.ALL)
    private List<Currencie> currencies;
    //@Transient
    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> items;

    public Player() {
    }

    public Player(String nickname) {
        this.nickname = nickname;
    }

    public Player(Integer playerId, String nickname, List<Progress> progresses, List<Currencie> currencies, List<Item> items) {
        this.playerId = playerId;
        this.nickname = nickname;
        this.progresses = progresses;
        this.currencies = currencies;
        this.items = items;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<Progress> getProgresses() {
        return progresses;
    }

    public void setProgresses(List<Progress> progresses) {
        this.progresses = progresses;
    }

    public List<Currencie> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currencie> currencies) {
        this.currencies = currencies;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}

