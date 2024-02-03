package com.example.myproductservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "taba")
@IdClass(TabId.class)
public class TabA {
    @Id
    @Column
    private Integer a_id1;
    @Id
    @Column
    private Integer a_id2;
    @Column
    private String description;

    @OneToMany(fetch = FetchType.EAGER)
    private List<TabB> tabBList;
}
