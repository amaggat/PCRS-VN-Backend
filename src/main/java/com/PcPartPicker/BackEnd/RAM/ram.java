package com.PcPartPicker.BackEnd.RAM;


import com.PcPartPicker.BackEnd._Model.electronicComponents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name ="ram")
public class ram extends electronicComponents {

//    @Column(name = "ddr")
//    @NotEmpty
//    private String DDR = new String();

    @Column(name = "clockspeed")
    @NotEmpty
    private int clockSpeed;

    @Column(name = "sizeofram")
    @NotEmpty
    private int sizeOfRam;

    public int getClockSpeed() {
        return clockSpeed;
    }

    public int getSizeOfRam() {
        return sizeOfRam;
    }

//    public String getDDR() {
//        return DDR;
//    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public void setSizeOfRam(int sizeOfRam) {
        this.sizeOfRam = sizeOfRam;
    }

//    public void setDDR(String DDR) {
//        this.DDR = DDR;
//    }

}
