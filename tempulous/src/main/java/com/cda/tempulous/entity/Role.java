package com.cda.tempulous.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "role")
@Data
public class Role {

    @Id
    private int id;

    @Column(name = "developpeur")
    private String developpeur;

    @Column(name = "testeur")
    private String testeur;

    @Column(name = "scrumMaster")
    private String scrumMaster;

    @Column(name = "chefDEquipe")
    private String chefDEquipe;

    @Column(name = "productOwner")
    private String productOwner;

    @Column(name = "productManager")
    private String productManager;

    @JoinColumn(name = "id")
    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    private Agent Agent;

}
