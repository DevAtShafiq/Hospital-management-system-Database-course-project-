package com.example.hospitaldatabase;

import javax.persistence.*;

@Entity
@Table(name = "services_available", schema = "hospital_management", catalog = "")
public class ServicesAvailableEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "item_one")
    private String itemOne;
    @Basic
    @Column(name = "item_two")
    private String itemTwo;
    @Basic
    @Column(name = "item_three")
    private String itemThree;
    @Basic
    @Column(name = "item_four")
    private String itemFour;
    @Basic
    @Column(name = "unit_name")
    private String unitName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemOne() {
        return itemOne;
    }

    public void setItemOne(String itemOne) {
        this.itemOne = itemOne;
    }

    public String getItemTwo() {
        return itemTwo;
    }

    public void setItemTwo(String itemTwo) {
        this.itemTwo = itemTwo;
    }

    public String getItemThree() {
        return itemThree;
    }

    public void setItemThree(String itemThree) {
        this.itemThree = itemThree;
    }

    public String getItemFour() {
        return itemFour;
    }

    public void setItemFour(String itemFour) {
        this.itemFour = itemFour;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServicesAvailableEntity that = (ServicesAvailableEntity) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (itemOne != null ? !itemOne.equals(that.itemOne) : that.itemOne != null) return false;
        if (itemTwo != null ? !itemTwo.equals(that.itemTwo) : that.itemTwo != null) return false;
        if (itemThree != null ? !itemThree.equals(that.itemThree) : that.itemThree != null) return false;
        if (itemFour != null ? !itemFour.equals(that.itemFour) : that.itemFour != null) return false;
        if (unitName != null ? !unitName.equals(that.unitName) : that.unitName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (itemOne != null ? itemOne.hashCode() : 0);
        result = 31 * result + (itemTwo != null ? itemTwo.hashCode() : 0);
        result = 31 * result + (itemThree != null ? itemThree.hashCode() : 0);
        result = 31 * result + (itemFour != null ? itemFour.hashCode() : 0);
        result = 31 * result + (unitName != null ? unitName.hashCode() : 0);
        return result;
    }
}
