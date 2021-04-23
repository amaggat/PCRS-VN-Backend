package backend.recommendation.type.rating;

import backend.pc.psu.PowerSupplyUnit;
import backend.recommendation.type.score.Rating;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "psu_rating")
public class PsuRating extends Rating {

    @ManyToOne
    @JoinColumn(name = "psuid")
    private PowerSupplyUnit psu;
}
