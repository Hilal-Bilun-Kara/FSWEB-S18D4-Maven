package com.workintech.s18d1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="burger", schema="fsweb")

//Db tablosunun javdaki class karşılığı  = entity
public class Burger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private Double price;

    @Column(name = "is_Vegan")
    private Boolean isVegan;

    @Column(name = "bread_Type")
    @Enumerated(EnumType.STRING)
    private BreadType breadType;

    private String contents;
}
