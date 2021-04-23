package backend.recommendation.type.rating;

import backend.pc.drives.HardDriveDisk.HardDiskDrive;
import backend.recommendation.type.score.Rating;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hdd_rating")
public class HddRating extends Rating {

    @ManyToOne
    @JoinColumn(name ="hddid")
    private HardDiskDrive hdd;
}
