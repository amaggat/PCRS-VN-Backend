package backend.retailer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface RetailerRepository extends JpaRepository<Retailer, Integer>, JpaSpecificationExecutor<Retailer> {

    @Query("SELECT DISTINCT retailer From Retailer retailer WHERE retailer.id= :id")
    @Transactional(readOnly = true)
    Retailer findByID(@Param("id") Integer id);
}
