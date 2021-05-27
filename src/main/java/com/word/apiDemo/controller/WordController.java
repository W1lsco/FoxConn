package com.word.apiDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.word.apiDemo.entity.Word;
import com.word.apiDemo.repository.WordRepository;


@RestController
public class WordController {
    private WordRepository wordrepository;
    @GetMapping("/word/search")
    public ResponseEntity<Word> getTheWord(@PathVariable String word){
        Word theWord = wordrepository.findWord(word);
        return new ResponseEntity<Word>(theWord, HttpStatus.OK);
    }
}