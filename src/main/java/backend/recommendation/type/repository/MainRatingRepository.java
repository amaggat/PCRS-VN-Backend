package backend.recommendation.type.repository;

import backend.recommendation.type.rating.MainboardRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MainRatingRepository extends JpaRepository<MainboardRating, String>, JpaSpecificationExecutor<MainboardRating> {
}
