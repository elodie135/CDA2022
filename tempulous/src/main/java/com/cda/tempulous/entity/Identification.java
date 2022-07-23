package com.cda.tempulous.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "identification")
@Data
public class Identification {

    @Id
    private int id;

    @Column(name = "mail", columnDefinition = "varach(30) not null")
    private String mail;

    @Column(name = "motDePasse", columnDefinition = "varach(30) not null")
    private String motDePasse;

    @JoinColumn(name = "id")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    private Agent agent;

}
