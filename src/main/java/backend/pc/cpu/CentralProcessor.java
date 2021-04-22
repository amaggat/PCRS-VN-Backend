package backend.pc.cpu;


import backend.model.ElectronicComponents;
import backend.pcprofile.PcProfile;
import backend.recommendation.type.rating.CpuRating;
import backend.util.Utility;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.util.List;


@Entity
@Table(name = "cpu")
public class CentralProcessor extends ElectronicComponents {

    @Column(name = "socket")
    @NotEmpty
    private String socket = new String();

    @Column(name = "cores")
    @NotEmpty
    private Integer cores;

    @Column(name = "threads")
    @NotEmpty
    private Integer Threads;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "centralProcessor", fetch = FetchType.EAGER)
    private List<CpuPriceList> PriceList;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "centralProcessor")
    private List<PcProfile> pcProfileList;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "centralProcessor")
    private List<CpuRating> cpuRatingList;

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public Integer getCores() {
        return cores;
    }

    public void setCores(Integer cores) {
        this.cores = cores;
    }

    public Integer getThreads() {
        return Threads;
    }

    public void setThreads(Integer threads) {
        Threads = threads;
    }

    public List<CpuPriceList> getPriceList() {
        return PriceList;
    }

    public void setPriceList(List<CpuPriceList> cpuPriceList) {
        this.PriceList = cpuPriceList;
    }

    public List<String> getPcProfileList() {
        return Utility.returnPcProfileID(this.pcProfileList);
    }

    public void setPcProfileList(List<PcProfile> pcProfileList) {
        this.pcProfileList = pcProfileList;
    }

    public List<CpuRating> getCpuRatingList() {
        return cpuRatingList;
    }

    public void setCpuRatingList(List<CpuRating> cpuRatingList) {
        this.cpuRatingList = cpuRatingList;
    }
}
