package com.example.Women_in_tech.controllers;

import com.example.Women_in_tech.repositories.WomanRepository;
import com.example.Women_in_tech.models.Woman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class WomanController {

    @Autowired
    WomanRepository womanRepository;

    @GetMapping(value = "/women")
    public ResponseEntity<List<Woman>> getAllWomen(){
        return new ResponseEntity<>(womanRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/women/{id}")
    public ResponseEntity getWoman(@PathVariable Long id){
        return new ResponseEntity<>(womanRepository.findById(id), HttpStatus.OK);
    }
    @PostMapping(value = "/women")
    public ResponseEntity<Woman> postWoman(@RequestBody Woman woman){
        womanRepository.save(woman);
        return new ResponseEntity<>(woman, HttpStatus.CREATED);
    }
    //Update-PutMapping
    //Destroy-DeleteMapping

}
