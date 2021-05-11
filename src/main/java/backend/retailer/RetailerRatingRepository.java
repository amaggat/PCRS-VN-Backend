package backend.retailer;

import backend.recommendation.type.rating.RetailerRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RetailerRatingRepository extends JpaRepository<RetailerRating, String>, JpaSpecificationExecutor<RetailerRating> {
}
