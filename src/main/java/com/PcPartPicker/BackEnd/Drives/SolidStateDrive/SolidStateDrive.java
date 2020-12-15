package com.PcPartPicker.BackEnd.Drives.SolidStateDrive;


import com.PcPartPicker.BackEnd._Model.electronicComponents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name ="ssd")
public class SolidStateDrive extends electronicComponents {

    @Column(name = "size")
    @NotEmpty
    private int size;

//    @Column(name = "writeSpeed")
//    @NotEmpty
//    private int writeSpeed;
//
//    @Column(name = "readSpeed")
//    @NotEmpty
//    private int readSpeed;

    @Column(name = "chipset")
    @NotEmpty
    private String chipset= new String();

    public int getSize() {
        return size;
    }

//    public int getReadSpeed() {
//        return readSpeed;
//    }
//
//    public int getWriteSpeed() {
//        return writeSpeed;
//    }

    public String getNandType() {
        return chipset;
    }

//    public void setReadSpeed(int readSpeed) {
//        this.readSpeed = readSpeed;
//    }
//
//    public void setWriteSpeed(int writeSpeed) {
//        this.writeSpeed = writeSpeed;
//    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setNandType(String nandType) {
        chipset = nandType;
    }
}
