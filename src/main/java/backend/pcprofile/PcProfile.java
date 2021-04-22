package backend.pcprofile;

import backend.pc.cpu.CentralProcessor;
import backend.pc.drives.HardDriveDisk.HardDiskDrive;
import backend.pc.drives.SolidStateDrive.SolidStateDrive;
import backend.pc.gpu.GraphicProcessor;
import backend.pc.mainboard.Mainboard;
import backend.pc.psu.PowerSupplyUnit;
import backend.pc.ram.Ram;
import backend.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name = "pcprofile")
public class PcProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id = new String();

    @Column(name = "pcname")
    @NotEmpty
    private String pcname = new String();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid")
    private User user;

    @Column(name = "type")
    private String type;

    @Column(name = "budget")
    private String budget;

    @Column(name = "target")
    private String target;

    @ManyToMany
    @JoinTable(
            name = "pcprofile_cpu",
            joinColumns = {@JoinColumn(name = "pcid")},
            inverseJoinColumns = {@JoinColumn(name = "cpuid")}
    )
    private List<CentralProcessor> centralProcessor;

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
    private List<Ram> ram;

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
    private List<GraphicProcessor> graphicProcessor;

    @ManyToMany
    @JoinTable(
            name = "pcprofile_psu",
            joinColumns = @JoinColumn(name = "pcid"),
            inverseJoinColumns = @JoinColumn(name = "psuid")
    )
    private List<PowerSupplyUnit> psu;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPcname(String pcname) {
        this.pcname = pcname;
    }

    public List<CentralProcessor> getCpu() {
        return centralProcessor;
    }

    public void setCpu(List<CentralProcessor> CentralProcessor) {
        this.centralProcessor = CentralProcessor;
    }

    public List<Mainboard> getMain() {
        return main;
    }

    public void setMain(List<Mainboard> main) {
        this.main = main;
    }

    public List<Ram> getRam() {
        return ram;
    }

    public void setRam(List<Ram> ram) {
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

    public List<GraphicProcessor> getGpu() {
        return graphicProcessor;
    }

    public void setGpu(List<GraphicProcessor> GraphicProcessor) {
        this.graphicProcessor = GraphicProcessor;
    }

    public List<PowerSupplyUnit> getPsu() {
        return psu;
    }

    public void setPsu(List<PowerSupplyUnit> psu) {
        this.psu = psu;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
