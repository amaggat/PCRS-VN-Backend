package backend.pc.gpu;

import backend.model.ElectronicComponents;
import backend.pcprofile.PcProfile;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "gpu")
public class GraphicProcessor extends ElectronicComponents {

    @Column(name = "VRam")
    @NotEmpty
    @Digits(fraction = 0, integer = 2)
    private Integer VRam;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "graphicProcessor")
    private List<PcProfile> pcProfileList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "graphicProcessor", fetch = FetchType.EAGER)
    private List<gpuPriceList> PriceList;

    public List<gpuPriceList> getPriceList() {
        return PriceList;
    }

    public void setPriceList(List<gpuPriceList> gpuPriceList) {
        this.PriceList = gpuPriceList;
    }

    public Integer getVRam() {
        return VRam;
    }

    public void setVRam(Integer VRam) {
        this.VRam = VRam;
    }

    public List<String> getPcProfileList() {
        List<String> IdList = new ArrayList<>();
        for (PcProfile pcProfile : this.pcProfileList) {
            IdList.add(pcProfile.getId());
        }
        return IdList;
    }

    public void setPcProfileList(List<PcProfile> pcProfile) {
        this.pcProfileList = pcProfile;
    }
}
