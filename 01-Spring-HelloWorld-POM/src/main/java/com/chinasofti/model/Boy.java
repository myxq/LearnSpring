package com.chinasofti.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author 李永庆
 * @since 2020/6/3
 */
public class Boy {

    private String name;
    private Dog dog;
    private List<String> fer;
    private Set<String> books;
    private Map<String,Integer> scores;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }


    public List<String> getFer() {
        return fer;
    }

    public void setFer(List<String> fer) {
        this.fer = fer;
    }

    public Set<String> getBooks() {
        return books;
    }

    public void setBooks(Set<String> books) {
        this.books = books;
    }

    public Map<String, Integer> getScores() {
        return scores;
    }

    public void setScores(Map<String, Integer> scores) {
        this.scores = scores;
    }
}
