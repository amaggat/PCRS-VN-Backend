package backend.recommendation.type.repository;

import backend.recommendation.type.rating.PsuRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PsuRatingRepository extends JpaRepository<PsuRating, Integer>, JpaSpecificationExecutor<PsuRating> {
}
