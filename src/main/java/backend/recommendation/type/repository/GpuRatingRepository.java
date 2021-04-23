package backend.recommendation.type.repository;

import backend.recommendation.type.rating.GpuRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GpuRatingRepository extends JpaRepository<GpuRating, Integer>, JpaSpecificationExecutor<GpuRating> {
}
