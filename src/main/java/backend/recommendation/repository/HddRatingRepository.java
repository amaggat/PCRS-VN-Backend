package backend.recommendation.repository;

import backend.recommendation.rating.HddRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HddRatingRepository extends JpaRepository<HddRating, String>, JpaSpecificationExecutor<HddRating> {
}
