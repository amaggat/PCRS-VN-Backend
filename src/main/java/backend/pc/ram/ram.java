package backend.pc.ram;


import backend.pc.electronicComponents;
import backend.pcprofile.PcProfile;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;


@Entity
@Table(name = "ram")
public class ram extends electronicComponents {

//    @Column(name = "ddr")
//    @NotEmpty
//    private String DDR = new String();

    @Column(name = "clockspeed")
    @NotEmpty
    private Integer clockSpeed;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "ram")
    private List<PcProfile> pcProfile;

    @Column(name = "sizeofram")
    @NotEmpty
    private String sizeOfRam = new String();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ram", fetch = FetchType.EAGER)
    private List<ramPriceList> PriceList;

    public int getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public String getSizeOfRam() {
        return sizeOfRam;
    }

    public void setSizeOfRam(String sizeOfRam) {
        this.sizeOfRam = sizeOfRam;
    }

    public List<ramPriceList> getPriceList() {
        return PriceList;
    }

    public void setPriceList(List<ramPriceList> ramPriceList) {
        this.PriceList = ramPriceList;


    }

//    public void setDDR(String DDR) {
//        this.DDR = DDR;
//    }

}
