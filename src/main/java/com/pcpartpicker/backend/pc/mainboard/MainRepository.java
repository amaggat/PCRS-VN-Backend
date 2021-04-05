package com.pcpartpicker.backend.pc.mainboard;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface MainRepository extends JpaRepository<Mainboard, Integer>, JpaSpecificationExecutor<Mainboard> {


    @Query("SELECT DISTINCT mainboard FROM Mainboard mainboard WHERE mainboard.id= :id")
    @Transactional(readOnly = true)
    Mainboard findByID(@Param("id") String id);

}
