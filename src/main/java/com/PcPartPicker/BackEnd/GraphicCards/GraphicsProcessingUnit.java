package com.PcPartPicker.BackEnd.GraphicCards;

import com.PcPartPicker.BackEnd._Model.electronicComponents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name = "gpu")
public class GraphicsProcessingUnit extends electronicComponents {
    private int numberOfFans;

    @Column(name = "VRam")
    @NotEmpty
    @Digits(fraction = 0, integer = 2)
    private int VRam;

    private int coreClock;

    @Column(name = "GDDR")
    @NotEmpty
    private String GDDR = new String();

    @Column(name ="productName")
    @NotEmpty
    private String productName = new String();

    public String getGDDR() {
        return GDDR;
    }

    public int getVRam() {
        return VRam;
    }

    public int getCoreClock() {
        return coreClock;
    }

    public int getNumberOfFans() {
        return numberOfFans;
    }

    public String getProductName() {
        return productName;
    }

    public void setGDDR(String GDDR) {
        this.GDDR = GDDR;
    }

    public void setVRam(int VRam) {
        this.VRam = VRam;
    }

    public void setCoreClock(int coreClock) {
        this.coreClock = coreClock;
    }

    public void setNumberOfFans(int numberOfFans) {
        this.numberOfFans = numberOfFans;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
