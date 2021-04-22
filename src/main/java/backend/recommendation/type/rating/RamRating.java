package backend.recommendation.type.rating;

import backend.pc.ram.Ram;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ram_rating")
public class RamRating extends Rating{

    @ManyToOne
    @JoinColumn(name = "ramid")
    private Ram ram;
}
