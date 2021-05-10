package backend.pc.drives.HardDriveDisk;

import backend.model.ElectronicComponents;
import backend.pcprofile.PcProfile;
import backend.recommendation.type.rating.CpuRating;
import backend.recommendation.type.rating.HddRating;
import backend.recommendation.type.rating.SsdRating;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name = "hdd")
public class HardDiskDrive extends ElectronicComponents {

    @Column(name = "storage")
    @NotEmpty
    private String storage;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "hdd")
    private List<PcProfile> pcProfile;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hdd", fetch = FetchType.EAGER)
    private List<HddPriceList> PriceList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hdd", fetch = FetchType.LAZY)
    private List<HddRating> hddRatingList;

    public List<HddPriceList> getPriceList() {
        return PriceList;
    }

    public void setPriceList(List<HddPriceList> PriceList) {
        this.PriceList = PriceList;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String size) {
        this.storage = size;
    }

    @Override
    public Double getAverageRating(){

        if(hddRatingList.isEmpty()) {
            return null;
        }
        else {
            double avg = 0.0;
            for(HddRating obj : this.hddRatingList) {
                avg += obj.getRating();
            }
            return (avg/this.hddRatingList.size());
        }

    }

    @Override
    public Integer getNumberOfRating(){
        return this.hddRatingList.size();
    }

}
