package com.tyss.movie_management_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Language {
    @Id
    private int id;

    private String name;

    private String lastName;
}
