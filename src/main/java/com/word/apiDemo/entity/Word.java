package com.word.apiDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Word {
    @Id
    private String word;
    public Word(String word){
        this.word = word;
    }
    public String getWord(){
        return word;
    }
    
}