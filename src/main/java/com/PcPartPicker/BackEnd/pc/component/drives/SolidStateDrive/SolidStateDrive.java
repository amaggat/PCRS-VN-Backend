package com.pcpartpicker.backend.pc.component.drives.SolidStateDrive;


import com.pcpartpicker.backend.pcprofile.PcProfile;
import com.pcpartpicker.backend.pc.electronicComponents;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;


@Entity
@Table(name ="ssd")
public class SolidStateDrive extends electronicComponents {

    @Column(name = "storage")
    @NotEmpty
    private String storage;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "ssd")
    private List<PcProfile> pcProfile;

//    @Column(name = "writeSpeed")
//    @NotEmpty
//    private int writeSpeed;
//
//    @Column(name = "readSpeed")
//    @NotEmpty
//    private int readSpeed;

    public String getStorage() {
        return storage;
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

    public void setStorage(String size) {
        this.storage = size;
    }
}
