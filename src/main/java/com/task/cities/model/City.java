package com.task.cities.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "city")
@Entity
@Data
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String photo;
}
