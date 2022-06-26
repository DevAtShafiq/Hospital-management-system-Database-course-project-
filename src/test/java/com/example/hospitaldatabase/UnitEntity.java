package com.example.hospitaldatabase;

import javax.persistence.*;

@Entity
@Table(name = "unit", schema = "hospital_management", catalog = "")
public class UnitEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "unit_name")
    private String unitName;
    @Basic
    @Column(name = "employee")
    private Short employee;

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Short getEmployee() {
        return employee;
    }

    public void setEmployee(Short employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UnitEntity that = (UnitEntity) o;

        if (unitName != null ? !unitName.equals(that.unitName) : that.unitName != null) return false;
        if (employee != null ? !employee.equals(that.employee) : that.employee != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = unitName != null ? unitName.hashCode() : 0;
        result = 31 * result + (employee != null ? employee.hashCode() : 0);
        return result;
    }
}
