package backend.recommendation.type.repository;

import backend.recommendation.type.rating.RamRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RamRatingRepository extends JpaRepository<RamRating, Integer>, JpaSpecificationExecutor<RamRating> {
}
