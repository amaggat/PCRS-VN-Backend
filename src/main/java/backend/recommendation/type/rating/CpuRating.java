package backend.recommendation.type.rating;

import backend.pc.cpu.CentralProcessor;
import backend.recommendation.type.score.Rating;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cpu_rating")
public class CpuRating extends Rating {

    @ManyToOne
    @JoinColumn(name = "cpuid")
    private CentralProcessor centralProcessor;

    public String getCentralProcessor() {
        return centralProcessor.getId();
    }

    public void setCentralProcessor(CentralProcessor centralProcessor) {
        this.centralProcessor = centralProcessor;
    }
}
