package com.example.module_4_minitest_2912.model;

import javax.persistence.*;

@Entity
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int bathroom;
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

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

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public House(String name, int bathroom, Category category) {
        this.name = name;
        this.bathroom = bathroom;
        this.category = category;
    }

    public House() {
    }
}
