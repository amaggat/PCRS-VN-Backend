package com.PcPartPicker.BackEnd.Drives.SolidStateDrive;


import com.PcPartPicker.BackEnd._Model.electronicComponents;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;


@Entity
@Table(name ="ssd")
public class SolidStateDrive extends electronicComponents {

    @Column(name = "size")
    @NotEmpty
    private String size;

//    @Column(name = "writeSpeed")
//    @NotEmpty
//    private int writeSpeed;
//
//    @Column(name = "readSpeed")
//    @NotEmpty
//    private int readSpeed;

    public String getSize() {
        return size;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ssd", fetch = FetchType.EAGER)
    private List<ssdPriceList> PriceList;

    public List<ssdPriceList> getPriceList() {
        return PriceList;
    }

    public void setPriceList(List<ssdPriceList> ssdPriceList) {
        this.PriceList = ssdPriceList;
    }

    //    public int getReadSpeed() {
//        return readSpeed;
//    }
//
//    public int getWriteSpeed() {
//        return writeSpeed;
//    }


//    public void setReadSpeed(int readSpeed) {
//        this.readSpeed = readSpeed;
//    }
//
//    public void setWriteSpeed(int writeSpeed) {
//        this.writeSpeed = writeSpeed;
//    }

    public void setSize(String size) {
        this.size = size;
    }
}
