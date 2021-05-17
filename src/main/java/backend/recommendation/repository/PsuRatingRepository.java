package backend.recommendation.repository;

import backend.recommendation.rating.PsuRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PsuRatingRepository extends JpaRepository<PsuRating, String>, JpaSpecificationExecutor<PsuRating> {
}
