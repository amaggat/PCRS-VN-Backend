package backend.pc.psu;


import backend.pc.electronicComponents;
import backend.pcprofile.PcProfile;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;


@Entity
@Table(name ="psu")
public class PowerSupplyUnit extends electronicComponents {

    @Column(name = "power")
    @NotEmpty
    private Integer power;

    @Column(name = "standard_80")
    @NotEmpty
    private String standard_80 = new String();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "psu", fetch = FetchType.EAGER)
    private List<psuPriceList> PriceList;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "psu")
    private List<PcProfile> pcProfile;

    public List<psuPriceList> getPriceList() {
        return PriceList;
    }

    public void setPriceList(List<psuPriceList> psuPriceList) {
        this.PriceList = psuPriceList;
    }

    //    @Column(name = "size")
//    @NotEmpty
//    private String size = new String();

//    public String getSize() {
//        return size;
//    }

    public String getStandard_80() {
        return standard_80;
    }

    public Integer getPower() {
        return power;
    }

//    public void setSize(String size) {
//        this.size = size;
//    }

    public void setStandard_80(String standard_80) {
        this.standard_80 = standard_80;
    }

    public void setPower(Integer power) {
        power = power;
    }
}
