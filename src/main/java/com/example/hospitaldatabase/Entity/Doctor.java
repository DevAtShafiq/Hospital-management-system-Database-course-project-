package com.example.hospitaldatabase.Entity;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "doctor")
public class Doctor implements  Serializable{

    @Id
    @GeneratedValue
    @Column(name = "ID", nullable = false)
    private Long ID;

    @Column(name = "name")
    private String name;



    @Column(name = "Designation")
    private String designation;

    @Column(name = "salary")
    private int salary;

    @Column(name = "D_O_B")
    private Date dateOfBirth;

    @Column(name = "uname")
    private String unitName;


    //relations
    @OneToOne
    private Contact contact;


    @OneToOne
    private Unit unit;

}
