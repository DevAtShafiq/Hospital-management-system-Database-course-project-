package com.example.hospitaldatabase.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "nurse")
public class Nurse {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "position")
    private String position;


    @Column(name = "salary")
    private BigDecimal salary;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

//    @OneToOne
//    private Unit unit;

}
