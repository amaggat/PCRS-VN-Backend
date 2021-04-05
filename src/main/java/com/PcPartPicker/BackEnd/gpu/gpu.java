package com.pcpartpicker.backend.gpu;

import com.pcpartpicker.backend.model.PcProfile;
import com.pcpartpicker.backend.model.electronicComponents;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import java.util.List;


@Entity
@Table(name = "gpu")
public class gpu extends electronicComponents {
//    private int numberOfFans;

    @Column(name = "VRam")
    @NotEmpty
    @Digits(fraction = 0, integer = 2)
    private Integer VRam;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "gpu")
    private List<PcProfile> pcProfile;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gpu", fetch = FetchType.EAGER)
    private List<gpuPriceList> PriceList;

    public List<gpuPriceList> getPriceList() {
        return PriceList;
    }

    public void setPriceList(List<gpuPriceList> gpuPriceList) {
        this.PriceList = gpuPriceList;
    }

    //    private int coreClock;

//    @Column(name = "GDDR")
//    @NotEmpty
//    private String GDDR = new String();

//    @Column(name ="productName")
//    @NotEmpty
//    private String productName = new String();

//    public String getGDDR() {
//        return GDDR;
//    }

    public int getVRam() {
        return VRam;
    }

//    public int getCoreClock() {
//        return coreClock;
//    }

//    public int getNumberOfFans() {
//        return numberOfFans;
//    }

//    public String getProductName() {
//        return productName;
//    }

//    public void setGDDR(String GDDR) {
//        this.GDDR = GDDR;
//    }

    public void setVRam(int VRam) {
        this.VRam = VRam;
    }

//    public void setCoreClock(int coreClock) {
//        this.coreClock = coreClock;
//    }

//    public void setNumberOfFans(int numberOfFans) {
//        this.numberOfFans = numberOfFans;
//    }

//    public void setProductName(String productName) {
//        this.productName = productName;
//    }
}
