package backend.pcprofile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PcProfileRepository extends JpaRepository<PcProfile, String>, JpaSpecificationExecutor<PcProfile> {

    @Query("SELECT DISTINCT pcProfile FROM PcProfile pcProfile WHERE pcProfile.id= :id")
    @Transactional(readOnly = true)
    PcProfile findByID(String id);

    @Query("SELECT DISTINCT pcProfile FROM PcProfile pcProfile WHERE pcProfile.user.id = :id")
    @Transactional(readOnly = true)
    List<PcProfile> findByUserID(Integer id);

}
