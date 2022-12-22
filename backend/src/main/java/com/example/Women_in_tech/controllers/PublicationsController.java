package com.example.Women_in_tech.controllers;

import com.example.Women_in_tech.models.Publication;
import com.example.Women_in_tech.repositories.PublicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class PublicationsController {

    @Autowired
    PublicationRepository publicationRepository;

    @GetMapping(value = "/publications")
    public ResponseEntity<List<Publication>> getAllPublications(){
        return new ResponseEntity<>(publicationRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/publications/{id}")
    public ResponseEntity getPublication(@PathVariable Long id){
        return new ResponseEntity<>(publicationRepository.findById(id), HttpStatus.OK);
    }

}
