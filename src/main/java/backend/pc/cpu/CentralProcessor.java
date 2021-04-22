package backend.pc.cpu;


import backend.model.ElectronicComponents;
import backend.pcprofile.PcProfile;


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

//    private double BaseClock;
//    private double BoostCLock;

    @Column(name = "cores")
    @NotEmpty
    private Integer cores;

    @Column(name = "threads")
    @NotEmpty
    private Integer Threads;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "CentralProcessor", fetch = FetchType.EAGER)
    private List<cpuPriceList> PriceList;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "CentralProcessor")
    private List<PcProfile> pcProfile;

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

    public List<cpuPriceList> getPriceList() {
        return PriceList;
    }

    public void setPriceList(List<cpuPriceList> cpuPriceList) {
        this.PriceList = cpuPriceList;
    }

}
