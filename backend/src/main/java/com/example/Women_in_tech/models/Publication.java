package com.example.Women_in_tech.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "publications")
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
   @Column
    private Integer printYear;
   @Column
    private String category;
   @Column
   private String url;

    @JsonIgnoreProperties({"publications"})
    @ManyToOne
    @JoinColumn(name = "woman", nullable = false)
    private Woman woman;

    public Publication(String title, Woman woman, int printYear, String category, String url) {
        this.title = title;
        this.woman = woman;
        this.printYear = printYear;
        this.category = category;
        this.url = url;
    }

    public Publication(){

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
//
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
//
    public Woman getWoman() {
        return woman;
    }

    public void setWoman(Woman woman) {
        this.woman = woman;
    }

    public int getPrintYear() {
        return printYear;
    }

    public void setPrintYear(int printYear) {
        this.printYear = printYear;
    }
//
   public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
