package com.PcPartPicker.BackEnd.Processor;


import com.PcPartPicker.BackEnd._Model.electronicComponents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name ="processor")
public class CPU extends electronicComponents {

    @Column(name = "socket")
    @NotEmpty
    private String socket = new String();
    private double BaseClock;
    private double BoostCLock;

    @Column(name = "Cores")
    @NotEmpty
    private int Cores;
    
    @Column(name = "Threads")
    @NotEmpty
    private int Threads;

    public String getSocket() {
        return socket;
    }

    public int getCores() {
        return Cores;
    }

    public int getThreads() {
        return Threads;
    }

    public double getBaseClock() {
        return BaseClock;
    }

    public double getBoostCLock() {
        return BoostCLock;
    }

    public void setBaseClock(double baseClock) {
        BaseClock = baseClock;
    }

    public void setBoostCLock(double boostCLock) {
        BoostCLock = boostCLock;
    }

    public void setCores(int cores) {
        Cores = cores;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public void setThreads(int threads) {
        Threads = threads;
    }
}
