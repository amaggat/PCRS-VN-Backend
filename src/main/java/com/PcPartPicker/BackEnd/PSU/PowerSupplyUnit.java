package com.PcPartPicker.BackEnd.PSU;


import com.PcPartPicker.BackEnd._Model.electronicComponents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name ="psu")
public class PowerSupplyUnit extends electronicComponents {

    @Column(name = "power")
    @NotEmpty
    private int Power;

    @Column(name = "standard_80")
    @NotEmpty
    private String standard_80 = new String();

//    @Column(name = "size")
//    @NotEmpty
//    private String size = new String();

//    public String getSize() {
//        return size;
//    }

    public String getStandard_80() {
        return standard_80;
    }

    public int getPower() {
        return Power;
    }

//    public void setSize(String size) {
//        this.size = size;
//    }

    public void setStandard_80(String standard_80) {
        this.standard_80 = standard_80;
    }

    public void setPower(int power) {
        Power = power;
    }
}
