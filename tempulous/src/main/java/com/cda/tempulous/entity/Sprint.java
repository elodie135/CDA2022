package com.cda.tempulous.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "sprint")
@Data
public class Sprint {

    @Id
    private int id;

}