package com.pcrs.pc.drives.SolidStateDrive;


import com.pcrs.pc.electronicComponents;
import com.pcrs.pcprofile.PcProfile;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;


@Entity
@Table(name = "ssd")
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ssd", fetch = FetchType.EAGER)
    private List<ssdPriceList> PriceList;

    public String getStorage() {
        return storage;
    }

    public void setStorage(String size) {
        this.storage = size;
    }

    public List<ssdPriceList> getPriceList() {
        return PriceList;
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

    public void setPriceList(List<ssdPriceList> ssdPriceList) {
        this.PriceList = ssdPriceList;
    }
}
