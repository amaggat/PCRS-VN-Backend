package backend.recommendation.repository;

import backend.recommendation.rating.SsdRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SsdRatingRepository extends JpaRepository<SsdRating, String>, JpaSpecificationExecutor<SsdRating> {
}
