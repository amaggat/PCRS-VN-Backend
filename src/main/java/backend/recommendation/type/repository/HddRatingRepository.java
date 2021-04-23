package backend.recommendation.type.repository;

import backend.recommendation.type.rating.HddRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HddRatingRepository extends JpaRepository<HddRating, Integer>, JpaSpecificationExecutor<HddRating> {
}
