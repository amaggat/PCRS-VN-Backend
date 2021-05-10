package backend.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserActivityRepository extends JpaRepository<UserActivity, String>, JpaSpecificationExecutor<UserActivity> {
}
