package backend.pcprofile;

import backend.pc.cpu.CentralProcessor;
import backend.pc.drives.HardDiskDrive.HardDiskDrive;
import backend.pc.drives.SolidStateDrive.SolidStateDrive;
import backend.pc.gpu.GraphicProcessor;
import backend.pc.mainboard.Mainboard;
import backend.pc.psu.PowerSupplyUnit;
import backend.pc.ram.Ram;
import backend.recommendation.score.Category;
import backend.user.User;
import javafx.util.Pair;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name = "pcprofile")
public class PcProfile {

    @Id
    private String id = new String();

    @Column(name = "pcname")
    @NotEmpty
    private String name = new String();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid")
    private User user;

    @ManyToOne
    @JoinColumn(name = "categoryid")
    private Category category;

    @Transient
    private int price;

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

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        int price = 0;

        for(CentralProcessor cpu : this.centralProcessor) {
            price += cpu.getMinPrice();
        }

        for(Mainboard mainboard : this.main) {
            price += mainboard.getMinPrice();
        }

        for(GraphicProcessor gpu : this.graphicProcessor) {
            price += gpu.getMinPrice();
        }

        for(Ram ram : this.ram) {
            price += ram.getMinPrice();
        }

        for(SolidStateDrive ssd : this.ssd) {
            price += ssd.getMinPrice();
        }

        for(HardDiskDrive hdd : this.hdd) {
            price += hdd.getMinPrice();
        }

        for(PowerSupplyUnit psu : this.psu) {
            price += psu.getMinPrice();
        }

        return price;
    }

    public Pair<Integer, String> getUser() {
        return new Pair<>(this.user.getId(), this.user.getName());
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setName(String pcname) {
        this.name = pcname;
    }

    public String getName() {
        return this.name;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
