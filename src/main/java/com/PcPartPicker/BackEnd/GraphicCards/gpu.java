package com.PcPartPicker.BackEnd.GraphicCards;

import com.PcPartPicker.BackEnd.RAM.ramPriceList;
import com.PcPartPicker.BackEnd._Model.electronicComponents;

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
    private int VRam;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gpu", fetch = FetchType.EAGER)
    private List<gpuPriceList> gpuPriceList;

    public List<com.PcPartPicker.BackEnd.GraphicCards.gpuPriceList> getGpuPriceList() {
        return gpuPriceList;
    }

    public void setGpuPriceList(List<com.PcPartPicker.BackEnd.GraphicCards.gpuPriceList> gpuPriceList) {
        this.gpuPriceList = gpuPriceList;
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
