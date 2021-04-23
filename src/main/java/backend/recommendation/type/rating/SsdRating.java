package backend.recommendation.type.rating;

import backend.pc.drives.SolidStateDrive.SolidStateDrive;
import backend.recommendation.type.score.Rating;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ssd_rating")
public class SsdRating extends Rating {

    @ManyToOne
    @JoinColumn(name = "ssdid")
    private SolidStateDrive ssd;
}
