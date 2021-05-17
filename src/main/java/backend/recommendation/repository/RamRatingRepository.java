package backend.recommendation.repository;

import backend.recommendation.rating.RamRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RamRatingRepository extends JpaRepository<RamRating, String>, JpaSpecificationExecutor<RamRating> {
}
