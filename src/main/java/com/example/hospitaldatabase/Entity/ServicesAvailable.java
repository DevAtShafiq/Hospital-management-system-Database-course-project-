package com.example.hospitaldatabase.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "services_available")
public class ServicesAvailable {

    @Id
    @GeneratedValue
    @Column(name = "id",nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;

    @Column(name = "item_one")
    private String itemOne;

    @Column(name = "item_two")
    private String itemTwo;

    @Column(name = "item_three")
    private String itemThree;

    @Column(name = "item_four")
    private String itemFour;


    //relations

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="unit_name",referencedColumnName = "id")
    private Unit unitName;

}
