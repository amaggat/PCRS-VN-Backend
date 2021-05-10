package backend.pc.gpu;

import backend.model.ElectronicComponents;
import backend.pcprofile.PcProfile;
import backend.recommendation.type.rating.GpuRating;
import backend.recommendation.type.rating.SsdRating;
import backend.util.Utility;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import java.util.List;


@Entity
@Table(name = "gpu")
public class GraphicProcessor extends ElectronicComponents {

    @Column(name = "VRam")
    @NotEmpty
    @Digits(fraction = 0, integer = 2)
    private Integer VRam;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "graphicProcessor", fetch = FetchType.EAGER)
    private List<GpuPriceList> PriceList;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "graphicProcessor")
    private List<PcProfile> pcProfileList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "graphicProcessor", fetch = FetchType.LAZY)
    private List<GpuRating> gpuRatingList;

    public List<GpuRating> getGpuRatingList() {
        return gpuRatingList;
    }

    public void setGpuRatingList(List<GpuRating> gpuRatingList) {
        this.gpuRatingList = gpuRatingList;
    }

    public List<GpuPriceList> getPriceList() {
        return PriceList;
    }

    public void setPriceList(List<GpuPriceList> gpuPriceList) {
        this.PriceList = gpuPriceList;
    }

    public Integer getVRam() {
        return VRam;
    }

    public void setVRam(Integer VRam) {
        this.VRam = VRam;
    }

    public List<String> getPcProfileList() {
        return Utility.returnPcProfileID(this.pcProfileList);
    }

    public void setPcProfileList(List<PcProfile> pcProfile) {
        this.pcProfileList = pcProfile;
    }

    @Override
    public Double getAverageRating(){

        if(gpuRatingList.isEmpty()) {
            return null;
        }
        else {
            double avg = 0.0;
            for(GpuRating obj : this.gpuRatingList) {
                avg += obj.getRating();
            }
            return (avg/this.gpuRatingList.size());
        }

    }

    @Override
    public Integer getNumberOfRating(){
        return this.gpuRatingList.size();
    }

    public GraphicProcessor() {
    }
}
