package com.PcPartPicker.BackEnd.Drives.HardDriveDisk;

import com.PcPartPicker.BackEnd._Model.electronicComponents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name ="hdd")
public class HardDiskDrive extends electronicComponents {

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
//
//    private int fanSpeed;

//    public int getFanSpeed() {
//        return fanSpeed;
//    }
//
//    public int getWriteSpeed() {
//        return writeSpeed;
//    }
//
//    public int getReadSpeed() {
//        return readSpeed;
//    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

//    public void setFanSpeed(int fanSpeed) {
//        this.fanSpeed = fanSpeed;
//    }
//
//    public void setWriteSpeed(int writeSpeed) {
//        this.writeSpeed = writeSpeed;
//    }
//
//    public void setReadSpeed(int readSpeed) {
//        this.readSpeed = readSpeed;
//    }
}
