package com.gamesaved.api.dto;

import java.io.Serializable;

public class RawgDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer count;
    private String next;
    private String previous;
    private GameDTO[] results;

    public RawgDTO() {

    }

    public RawgDTO(Integer count, String next, String previous, GameDTO[] results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public GameDTO[] getResults() {
        return results;
    }

    public void setResults(GameDTO[] results) {
        this.results = results;
    }
}
