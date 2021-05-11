package backend.pc.drives.SolidStateDrive;


import backend.model.ElectronicComponents;
import backend.pcprofile.PcProfile;
import backend.recommendation.type.rating.GpuRating;
import backend.recommendation.type.rating.HddRating;
import backend.recommendation.type.rating.SsdRating;

import javax.persistence.*;
import javax.swing.text.html.Option;
import javax.validation.constraints.NotEmpty;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Optional;


@Entity
@Table(name = "ssd")
public class SolidStateDrive extends ElectronicComponents {

    @Column(name = "storage")
    @NotEmpty
    private String storage;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "ssd")
    private List<PcProfile> pcProfile;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ssd", fetch = FetchType.EAGER)
    private List<SsdPriceList> PriceList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ssd", fetch = FetchType.LAZY)
    private List<SsdRating> ssdRatingList;

    @Transient
    private Optional<SsdRating> ssdRating;

    public String getStorage() {
        return storage;
    }

    public void setStorage(String size) {
        this.storage = size;
    }

    public List<SsdPriceList> getPriceList() {
        return PriceList;
    }

    public void setPriceList(List<SsdPriceList> ssdPriceList) {
        this.PriceList = ssdPriceList;
    }

    @Override
    public Double getAverageRating(){

        if(ssdRatingList.isEmpty()) {
            return null;
        }
        else {
            double avg = 0.0;
            for(SsdRating obj : this.ssdRatingList) {
                avg += obj.getRating();
            }
            avg = avg/this.ssdRatingList.size();
            double average = (((int)avg)*100)/100;
            return average;
        }

    }

    @Override
    public Integer getNumberOfRating(){
        return this.ssdRatingList.size();
    }

    public Optional<SsdRating> getSsdRating() {
        return ssdRating;
    }

    public void setSsdRating(Optional<SsdRating> ssdRating) {
        this.ssdRating = ssdRating;
    }
}
