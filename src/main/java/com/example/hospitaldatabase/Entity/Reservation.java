package com.example.hospitaldatabase.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "Reservation")
@Table(name = "reservation")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Reservation implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id",nullable = false)
    private Long id;

    @Column(name = "patient_name")
    private String patientName;
    @Column(name = "symptom")
    private String symptom;
    @Column(name = "dateOfReservation")
    private String reservationDate;



}
