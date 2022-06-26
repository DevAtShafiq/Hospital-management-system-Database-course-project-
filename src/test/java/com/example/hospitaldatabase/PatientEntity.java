package com.example.hospitaldatabase;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "patient", schema = "hospital_management", catalog = "")
public class PatientEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "age")
    private Byte age;
    @Basic
    @Column(name = "problem")
    private Object problem;
    @Basic
    @Column(name = "address")
    private String address;
    @Basic
    @Column(name = "reserved_at")
    private Timestamp reservedAt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public Object getProblem() {
        return problem;
    }

    public void setProblem(Object problem) {
        this.problem = problem;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getReservedAt() {
        return reservedAt;
    }

    public void setReservedAt(Timestamp reservedAt) {
        this.reservedAt = reservedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientEntity that = (PatientEntity) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (problem != null ? !problem.equals(that.problem) : that.problem != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (reservedAt != null ? !reservedAt.equals(that.reservedAt) : that.reservedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (problem != null ? problem.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (reservedAt != null ? reservedAt.hashCode() : 0);
        return result;
    }
}
