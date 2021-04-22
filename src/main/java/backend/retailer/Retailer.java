package backend.retailer;

import backend.model.NameEntity;
import backend.pc.cpu.CpuPriceList;
import backend.pc.drives.HardDriveDisk.HddPriceList;
import backend.pc.drives.SolidStateDrive.SsdPriceList;
import backend.pc.gpu.GpuPriceList;
import backend.pc.mainboard.MainPriceList;
import backend.pc.psu.PsuPriceList;
import backend.pc.ram.RamPriceList;
import backend.recommendation.type.rating.RetailerRating;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "retailer")
public class Retailer extends NameEntity {

    @Column(name = "facebook")
    private String facebook;

    @Column(name = "shop")
    private String shop;

    @Column(name = "description")
    private String description;

    @Column(name = "logo")
    private String logo;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "retailer")
    private List<RetailerRating> retailerRatingList;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "retailer")
    private List<CpuPriceList> cpuList;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "retailer")
    private List<GpuPriceList> gpuList;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "retailer")
    private List<MainPriceList> mainboardList;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "retailer")
    private List<SsdPriceList> ssdList;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "retailer")
    private List<HddPriceList> hddList;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "retailer")
    private List<PsuPriceList> psuList;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "retailer")
    private List<RamPriceList> ramList;

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<RetailerRating> getRetailerRatingList() {
        return retailerRatingList;
    }

    public void setRetailerRatingList(List<RetailerRating> retailerRatingList) {
        this.retailerRatingList = retailerRatingList;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
