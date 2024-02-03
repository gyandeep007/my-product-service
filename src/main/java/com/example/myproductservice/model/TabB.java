package com.example.myproductservice.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity(name = "tabb")
public class TabB {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer b_id;


    @ManyToOne
   private TabB tabBList;
}
