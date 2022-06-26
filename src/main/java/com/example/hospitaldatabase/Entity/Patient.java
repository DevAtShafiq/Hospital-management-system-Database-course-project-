package com.example.hospitaldatabase.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "problem")
    private String problem;

    @Column(name = "address")
    private String address;

    @Column(name = "admit_at")
    private Date admitAt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="unit_name",referencedColumnName = "id")
    private Unit unitName;

}
