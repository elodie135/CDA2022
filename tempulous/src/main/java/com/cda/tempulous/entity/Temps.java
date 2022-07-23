package com.cda.tempulous.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "temps")
@Data
public class Temps {

    @Id
    private int id;

    private int demiJournee;

    @JoinColumn(name = "id")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    private Agent agent;

    @JoinColumn(name = "id")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    private Projet projet;

}