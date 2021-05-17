package backend.recommendation.repository;

import backend.recommendation.rating.CpuRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CpuRatingRepository extends JpaRepository<CpuRating, String>, JpaSpecificationExecutor<CpuRating> {

}
