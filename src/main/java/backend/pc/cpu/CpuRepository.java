package backend.pc.cpu;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CpuRepository extends JpaRepository<CentralProcessor, Integer>, JpaSpecificationExecutor<CentralProcessor> {

    @Query("SELECT DISTINCT cpu FROM CentralProcessor cpu WHERE cpu.id= :id")
    @Transactional(readOnly = true)
    CentralProcessor findByID(@Param("id") String id);

}
