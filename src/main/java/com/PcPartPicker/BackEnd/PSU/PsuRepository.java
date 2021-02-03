package com.PcPartPicker.BackEnd.PSU;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

public interface PsuRepository extends JpaRepository<PowerSupplyUnit, Integer>, JpaSpecificationExecutor<PowerSupplyUnit> {

//    @Query("SELECT DISTINCT psu FROM PowerSupplyUnit psu")
//    @Transactional(readOnly = true)
//    List<PowerSupplyUnit> findAll();

    @Query("SELECT DISTINCT psu FROM PowerSupplyUnit psu WHERE psu.id=:id")
    PowerSupplyUnit findByID(@Param("id") String id);


}
