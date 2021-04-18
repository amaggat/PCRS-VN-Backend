package com.pcrs.pc.drives.HardDriveDisk;

import com.pcrs.pc.electronicComponents;
import com.pcrs.pcprofile.PcProfile;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name = "hdd")
public class HardDiskDrive extends electronicComponents {

    @Column(name = "storage")
    @NotEmpty
    private String storage;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "hdd")
    private List<PcProfile> pcProfile;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hdd", fetch = FetchType.EAGER)
    private List<hddPriceList> PriceList;

    public List<hddPriceList> getPriceList() {
        return PriceList;
    }

    public void setPriceList(List<hddPriceList> PriceList) {
        this.PriceList = PriceList;
    }

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

    public String getStorage() {
        return storage;
    }

    public void setStorage(String size) {
        this.storage = size;
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
