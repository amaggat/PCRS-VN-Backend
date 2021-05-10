package backend.retailer;

import backend.recommendation.type.rating.RetailerRating;
import backend.recommendation.type.rating.SsdRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RetailerRatingRepository extends JpaRepository<RetailerRating, String>, JpaSpecificationExecutor<RetailerRating> {
}
