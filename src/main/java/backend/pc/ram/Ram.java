package backend.pc.ram;


import backend.model.ElectronicComponents;
import backend.pcprofile.PcProfile;
import backend.recommendation.type.rating.PsuRating;
import backend.recommendation.type.rating.RamRating;
import backend.util.Utility;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;


@Entity
@Table(name = "ram")
public class Ram extends ElectronicComponents {

    @Column(name = "clockspeed")
    @NotEmpty
    private Integer clockSpeed;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "ram")
    private List<PcProfile> pcProfileList;

    @Column(name = "sizeofram")
    @NotEmpty
    private String sizeOfRam = new String();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ram", fetch = FetchType.EAGER)
    private List<RamPriceList> PriceList;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "ram")
    private List<RamRating> ramRatingList;

    public Integer getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(Integer clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public String getSizeOfRam() {
        return sizeOfRam;
    }

    public void setSizeOfRam(String sizeOfRam) {
        this.sizeOfRam = sizeOfRam;
    }

    public List<RamPriceList> getPriceList() {
        return PriceList;
    }

    public void setPriceList(List<RamPriceList> ramPriceList) {
        this.PriceList = ramPriceList;
    }

    public List<String> getPcProfileList() {
        return Utility.returnPcProfileID(this.pcProfileList);
    }

    public void setPcProfileList(List<PcProfile> pcProfileList) {
        this.pcProfileList = pcProfileList;
    }

    public List<RamRating> getRamRatingList() {
        return ramRatingList;
    }

    public void setRamRatingList(List<RamRating> ramRatingList) {
        this.ramRatingList = ramRatingList;
    }

    @Override
    public Double getAverageRating(){

        if(ramRatingList.isEmpty()) {
            return null;
        }
        else {
            double avg = 0.0;
            for(RamRating obj : this.ramRatingList) {
                avg += obj.getRating();
            }
            return (avg/this.ramRatingList.size());
        }

    }

    @Override
    public Integer getNumberOfRating(){
        return this.ramRatingList.size();
    }
}
