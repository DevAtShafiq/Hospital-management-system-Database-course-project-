package com.example.hospitaldatabase.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.print.Doc;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "unit")
public class Unit {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "unit_name", nullable = false)
    private String unitName;

    @Column(name = "employee")
    private Integer employee;

    @OneToOne(mappedBy = "unit")
    private Doctor doctor;

//    @OneToOne(mappedBy = "unit")
//    private Nurse nurse;

    @OneToOne(mappedBy = "unitName")
    private Patient patient;

    @OneToOne(mappedBy = "unitName")
    private ServicesAvailable serviceAvailable;


}
