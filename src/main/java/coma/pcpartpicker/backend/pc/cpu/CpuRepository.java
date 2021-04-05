package coma.pcpartpicker.backend.pc.cpu;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CpuRepository extends JpaRepository<cpu, Integer>, JpaSpecificationExecutor<cpu> {

    @Query("SELECT DISTINCT cpu FROM cpu cpu WHERE " +
            "cpu.id= :id")
    @Transactional(readOnly = true)
    cpu findByID(@Param("id") String id);

}
