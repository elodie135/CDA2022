package com.cda.tempulous.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Tache")
@Data
public class Tache {

    @Id
    private int id;

    @Column(name = "us")
    private String us;

    @Column(name = "anomalie")
    private String anomalie;

    @Column(name = "test")
    private String test;

    @Column(name = "gestion")
    private String gestion;

    @Column(name = "maquettage")
    private String maquettage;

}