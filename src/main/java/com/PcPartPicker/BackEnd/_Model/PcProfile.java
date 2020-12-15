package com.PcPartPicker.BackEnd._Model;

import com.PcPartPicker.BackEnd.Drives.HardDriveDisk.HardDiskDrive;
import com.PcPartPicker.BackEnd.Drives.SolidStateDrive.SolidStateDrive;
import com.PcPartPicker.BackEnd.GraphicCards.GraphicsProcessingUnit;
import com.PcPartPicker.BackEnd.Mainboard.Mainboard;
import com.PcPartPicker.BackEnd.PSU.PowerSupplyUnit;
import com.PcPartPicker.BackEnd.Processor.CPU;
import com.PcPartPicker.BackEnd.RAM.RAM;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
@Table(name ="pcprofile")
public class PcProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id = new String();
    
    @Column(name = "PcName")
    @NotEmpty
    private String PcName = new String();
    
    @Column(name = "price")
    @NotEmpty
    private double PcPrice;

    @ManyToMany
    @JoinTable(
            name = "pcprofile_cpu",
            joinColumns = @JoinColumn(name = "PcID"),
            inverseJoinColumns = @JoinColumn(name = "CpuID")
    )
    private Set<CPU> cpu;

    @ManyToMany
    @JoinTable(
            name = "pcprofile_mainboard",
            joinColumns = @JoinColumn(name = "PcID"),
            inverseJoinColumns = @JoinColumn(name = "MainID")
    )
    private Set<Mainboard> main;

    @ManyToMany
    @JoinTable(
            name = "pcprofile_ram",
            joinColumns = @JoinColumn(name = "PcID"),
            inverseJoinColumns = @JoinColumn(name = "RamID")
    )
    private Set<RAM> ram;

    @ManyToMany
    @JoinTable(
            name = "pcprofile_ssd",
            joinColumns = @JoinColumn(name = "PcID"),
            inverseJoinColumns = @JoinColumn(name = "SsdID")
    )
    private Set<SolidStateDrive> ssd;

    @ManyToMany
    @JoinTable(
            name = "pcprofile_hdd",
            joinColumns = @JoinColumn(name = "PcID"),
            inverseJoinColumns = @JoinColumn(name = "HddID")
    )
    private Set<HardDiskDrive> hdd;

    @ManyToMany
    @JoinTable(
            name = "pcprofile_gpu",
            joinColumns = @JoinColumn(name = "PcID"),
            inverseJoinColumns = @JoinColumn(name = "GpuID")
    )
    private Set<GraphicsProcessingUnit> gpu;

    @ManyToMany
    @JoinTable(
            name = "pcprofile_psu",
            joinColumns = @JoinColumn(name = "PcID"),
            inverseJoinColumns = @JoinColumn(name = "PsuID")
    )
    private Set<PowerSupplyUnit> psu;


    public String getId() {
        return id;
    }

    public double getPcPrice() {
        return PcPrice;
    }

    public String getPcName() {
        return PcName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPcName(String pcName) {
        PcName = pcName;
    }

    public void setPcPrice(double pcPrice) {
        PcPrice = pcPrice;
    }

    public Set<CPU> getCpu() {
        return cpu;
    }

    public void setCpu(Set<CPU> cpu) {
        this.cpu = cpu;
    }

    public Set<Mainboard> getMain() {
        return main;
    }

    public void setMain(Set<Mainboard> main) {
        this.main = main;
    }

    public Set<RAM> getRam() {
        return ram;
    }

    public void setRam(Set<RAM> ram) {
        this.ram = ram;
    }

    public Set<SolidStateDrive> getSsd() {
        return ssd;
    }

    public void setSsd(Set<SolidStateDrive> ssd) {
        this.ssd = ssd;
    }

    public Set<HardDiskDrive> getHdd() {
        return hdd;
    }

    public void setHdd(Set<HardDiskDrive> hdd) {
        this.hdd = hdd;
    }

    public Set<GraphicsProcessingUnit> getGpu() {
        return gpu;
    }

    public void setGpu(Set<GraphicsProcessingUnit> gpu) {
        this.gpu = gpu;
    }

    public Set<PowerSupplyUnit> getPsu() {
        return psu;
    }

    public void setPsu(Set<PowerSupplyUnit> psu) {
        this.psu = psu;
    }

    public boolean isNew() {
        return this.id == null;
    }

}
