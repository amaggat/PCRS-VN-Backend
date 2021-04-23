package backend.recommendation.type.rating;

import backend.pc.mainboard.Mainboard;
import backend.recommendation.type.score.Rating;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mainboard_rating")
public class MainboardRating extends Rating {

    @ManyToOne
    @JoinColumn(name = "mainboardId")
    private Mainboard mainboard;
}
