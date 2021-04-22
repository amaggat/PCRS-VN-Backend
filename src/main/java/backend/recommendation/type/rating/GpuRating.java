package backend.recommendation.type.rating;

import backend.pc.gpu.GraphicProcessor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "gpu_rating")
public class GpuRating extends Rating{

    @ManyToOne
    @JoinColumn(name = "gpuid")
    private GraphicProcessor graphicProcessor;


}
