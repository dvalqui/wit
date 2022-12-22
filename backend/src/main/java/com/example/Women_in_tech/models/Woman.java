package com.example.Women_in_tech.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "women")
public class Woman {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String dob;
    @Column(columnDefinition = "LONGTEXT")
    private String bio;
    @Column
    private String agency;

    @JsonIgnoreProperties({"woman"})
    @OneToMany(mappedBy = "woman", fetch = FetchType.LAZY)
    private List<Publication> publications;

    public Woman(String name, String dob, String bio, String agency) {
        this.name = name;
        this.dob = dob;
        this.bio = bio;
        this.agency = agency;
        this.publications = new ArrayList<>();
    }

    public Woman(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }


    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public List<Publication> getPublications() {
        return publications;
    }

    public void setPublications(List<Publication> publications) {
        this.publications = publications;
    }
}
