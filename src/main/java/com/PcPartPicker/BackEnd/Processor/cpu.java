package com.PcPartPicker.BackEnd.Processor;


import com.PcPartPicker.BackEnd._Model.PcProfile;
import com.PcPartPicker.BackEnd._Model.electronicComponents;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;


@Entity
@Table(name ="cpu")
public class cpu extends electronicComponents {

    @Column(name = "socket")
    @NotEmpty
    private String socket = new String();

//    private double BaseClock;
//    private double BoostCLock;

    @Column(name = "cores")
    @NotEmpty
    private Integer cores;
    
    @Column(name = "threads")
    @NotEmpty
    private Integer threads;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cpu", fetch = FetchType.EAGER)
    private List<cpuPriceList> PriceList;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "cpu")
    private List<PcProfile> pcProfile;

    public String getSocket() {
        return socket;
    }


//    public double getBaseClock() {
//        return BaseClock;
//    }
//
//    public double getBoostCLock() {
//        return BoostCLock;
//    }
//
//    public void setBaseClock(double baseClock) {
//        BaseClock = baseClock;
//    }
//
//    public void setBoostCLock(double boostCLock) {
//        BoostCLock = boostCLock;
//    }


    public void setSocket(String socket) {
        this.socket = socket;
    }

    public Integer getCores() {
        return cores;
    }

    public void setCores(Integer cores) {
        this.cores = cores;
    }

    public Integer getThreads() {
        return threads;
    }

    public void setThreads(Integer threads) {
        threads = threads;
    }

    public List<com.PcPartPicker.BackEnd.Processor.cpuPriceList> getPriceList() {
        return PriceList;
    }

    public void setPriceList(List<com.PcPartPicker.BackEnd.Processor.cpuPriceList> cpuPriceList) {
        this.PriceList = cpuPriceList;
    }

//    public List<PcProfile> getPcProfile() {
//        return pcProfile;
//    }
//
//    public void setPcProfile(List<PcProfile> pcProfile) {
//        this.pcProfile = pcProfile;
//    }
}
