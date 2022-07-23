package com.cda.tempulous.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "projet")
@Data
public class Projet {

    @Id
    private int id;

    @Column(name = "nom", columnDefinition = "varach(30) not null")
    private String nom;

    @JoinColumn(name = "id")
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    private Temps temps;

    @JoinColumn(name = "id")
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    private Agent agent;

}
