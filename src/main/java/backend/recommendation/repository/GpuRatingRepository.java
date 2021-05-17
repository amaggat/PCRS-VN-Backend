package backend.recommendation.repository;

import backend.recommendation.rating.GpuRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GpuRatingRepository extends JpaRepository<GpuRating, String>, JpaSpecificationExecutor<GpuRating> {
}
