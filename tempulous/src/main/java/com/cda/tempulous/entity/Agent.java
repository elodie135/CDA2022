package com.cda.tempulous.entity;


import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "agent")
@Data
public class Agent {

    @Id
    private int id;

    @Column(name = "nom", columnDefinition = "varchar(30) not null")
    private String nom;

    @JoinColumn(name = "id")
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    private Role role;

    @JoinColumn(name = "id")
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    private Projet projet;

    @JoinColumn(name = "id")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    private Identification identification;

}
