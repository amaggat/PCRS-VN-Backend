package backend.pcprofile;

import backend.pc.drives.HardDriveDisk.HardDiskDrive;
import backend.pc.drives.SolidStateDrive.SolidStateDrive;
import backend.pc.gpu.gpu;
import backend.pc.mainboard.Mainboard;
import backend.pc.psu.PowerSupplyUnit;
import backend.pc.cpu.cpu;
import backend.pc.ram.ram;
import backend.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name ="backend.pcprofile")
public class PcProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id = new String();
    
    @Column(name = "pcname")
    @NotEmpty
    private String pcname = new String();
    
//    @Column(name = "price")
//    @NotEmpty
//    private double PcPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid")
    private User user;

    @ManyToMany
    @JoinTable(
            name = "pcprofile_cpu",
            joinColumns = {@JoinColumn(name = "pcid")},
            inverseJoinColumns = {@JoinColumn(name = "cpuid")}
    )
    private List<cpu> cpu;

    @ManyToMany
    @JoinTable(
            name = "pcprofile_mainboard",
            joinColumns = {@JoinColumn(name = "pcid")},
            inverseJoinColumns = {@JoinColumn(name = "mainid")}
    )
    private List<Mainboard> main;

    @ManyToMany
    @JoinTable(
            name = "pcprofile_ram",
            joinColumns = @JoinColumn(name = "pcid"),
            inverseJoinColumns = @JoinColumn(name = "ramid")
    )
    private List<ram> ram;

    @ManyToMany
    @JoinTable(
            name = "pcprofile_ssd",
            joinColumns = @JoinColumn(name = "pcid"),
            inverseJoinColumns = @JoinColumn(name = "ssdid")
    )
    private List<SolidStateDrive> ssd;

    @ManyToMany
    @JoinTable(
            name = "pcprofile_hdd",
            joinColumns = @JoinColumn(name = "pcid"),
            inverseJoinColumns = @JoinColumn(name = "hddid")
    )
    private List<HardDiskDrive> hdd;

    @ManyToMany
    @JoinTable(
            name = "pcprofile_gpu",
            joinColumns = @JoinColumn(name = "pcid"),
            inverseJoinColumns = @JoinColumn(name = "gpuid")
    )
    private List<gpu> gpu;

    @ManyToMany
    @JoinTable(
            name = "pcprofile_psu",
            joinColumns = @JoinColumn(name = "pcid"),
            inverseJoinColumns = @JoinColumn(name = "psuid")
    )
    private List<PowerSupplyUnit> psu;


//    public String getId() {
//        return id;
//    }

//    public double getPcPrice() {
//        return PcPrice;
//    }

//    public String getPcname() {
//        return pcname;
//    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPcname(String pcname) {
        this.pcname = pcname;
    }

//    public void setPcPrice(double pcPrice) {
//        PcPrice = pcPrice;
//    }


//    public User getUser() {
//        User user1 = new User();
//        user1.setName(backend.user.getName());
//        user1.setGmail(backend.user.getGmail());
//        return user1;
//    }
//
//    public void setUser(User backend.user) {
//        this.backend.user = backend.user;
//    }

    public List<cpu> getCpu() {
        return cpu;
    }

    public void setCpu(List<cpu> cpu) {
        this.cpu = cpu;
    }

    public List<Mainboard> getMain() {
        return main;
    }

    public void setMain(List<Mainboard> main) {
        this.main = main;
    }

    public List<ram> getRam() {
        return ram;
    }

    public void setRam(List<ram> ram) {
        this.ram = ram;
    }

    public List<SolidStateDrive> getSsd() {
        return ssd;
    }

    public void setSsd(List<SolidStateDrive> ssd) {
        this.ssd = ssd;
    }

    public List<HardDiskDrive> getHdd() {
        return hdd;
    }

    public void setHdd(List<HardDiskDrive> hdd) {
        this.hdd = hdd;
    }

    public List<gpu> getGpu() {
        return gpu;
    }

    public void setGpu(List<gpu> gpu) {
        this.gpu = gpu;
    }

    public List<PowerSupplyUnit> getPsu() {
        return psu;
    }

    public void setPsu(List<PowerSupplyUnit> psu) {
        this.psu = psu;
    }
}
