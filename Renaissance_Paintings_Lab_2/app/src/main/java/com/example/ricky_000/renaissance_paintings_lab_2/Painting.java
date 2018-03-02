package com.example.ricky_000.renaissance_paintings_lab_2;

/**
 * Created by ricky_000 on 2/18/2018.
 */

public class Painting {

    private String _Description;
    private int _Id;

    // Constructor Method
    public Painting(String description, int id){
        _Description = description;
        _Id = id;
    }

    // Getters and Setters
    public String getDescription(){
        return _Description;
    }

    public void setDescription(String description){
        _Description = description;
    }

    public int getId(){
        return _Id;
    }

    public void setId(int id){
        _Id = id;
    }
}
