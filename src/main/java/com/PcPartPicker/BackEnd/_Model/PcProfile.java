package com.PcPartPicker.BackEnd._Model;



import com.PcPartPicker.BackEnd._Model.RelationshipConnect.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
@Table(name ="pcprofile")
public class PcProfile {
    
    @Column(name = "PcName")
    @NotEmpty
    private String PcName = new String();
    
    @Column(name = "price")
    @NotEmpty
    private double PcPrice;
    
    @Column(name = "PcID")
    @NotEmpty
    private static String PcID;

    @OneToMany(mappedBy = "processor")
    private Set<PcProfile_Cpu> cpu;

    @OneToMany(mappedBy = "main")
    private Set<PcProfile_Main> main;

    @OneToMany(mappedBy = "ram")
    private Set<PcProfile_Ram> ram;

    @OneToMany(mappedBy = "ssd")
    private Set<PcProfile_Ssd> ssd;

    @OneToMany(mappedBy = "hdd")
    private Set<PcProfile_Hdd> hdd;

    @OneToMany(mappedBy = "gpu")
    private Set<PcProfile_Gpu> gpu;

    @OneToMany(mappedBy = "psu")
    private Set<PcProfile_Psu> psu;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public static String getPcID() {
        return PcID;
    }

    public double getPcPrice() {
        return PcPrice;
    }

    public String getPcName() {
        return PcName;
    }

    public void setPcID(String pcID) {
        PcID = pcID;
    }

    public void setPcName(String pcName) {
        PcName = pcName;
    }

    public void setPcPrice(double pcPrice) {
        PcPrice = pcPrice;
    }

    public Set<PcProfile_Cpu> getCpu() {
        return cpu;
    }

    public void setCpu(Set<PcProfile_Cpu> cpu) {
        this.cpu = cpu;
    }

    public Set<PcProfile_Main> getMain() {
        return main;
    }

    public void setMain(Set<PcProfile_Main> main) {
        this.main = main;
    }

    public Set<PcProfile_Ram> getRam() {
        return ram;
    }

    public void setRam(Set<PcProfile_Ram> ram) {
        this.ram = ram;
    }

    public Set<PcProfile_Ssd> getSsd() {
        return ssd;
    }

    public void setSsd(Set<PcProfile_Ssd> ssd) {
        this.ssd = ssd;
    }

    public Set<PcProfile_Hdd> getHdd() {
        return hdd;
    }

    public void setHdd(Set<PcProfile_Hdd> hdd) {
        this.hdd = hdd;
    }

    public Set<PcProfile_Gpu> getGpu() {
        return gpu;
    }

    public void setGpu(Set<PcProfile_Gpu> gpu) {
        this.gpu = gpu;
    }

    public Set<PcProfile_Psu> getPsu() {
        return psu;
    }

    public void setPsu(Set<PcProfile_Psu> psu) {
        this.psu = psu;
    }
    
    public boolean isNew() {
        return this.PcID == null;
    }

}
