package backend.recommendation.type.rating;

import backend.retailer.Retailer;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "retailer_rating")
public class RetailerRating extends Rating{

    @ManyToOne
    @JoinColumn(name = "retailerid")
    private Retailer retailer;
}
