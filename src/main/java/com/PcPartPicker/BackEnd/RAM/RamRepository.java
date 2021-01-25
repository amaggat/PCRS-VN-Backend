package com.PcPartPicker.BackEnd.RAM;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

public interface RamRepository extends JpaRepository<ram, Integer>, JpaSpecificationExecutor<ram> {

    @Query("SELECT DISTINCT ram From ram ram WHERE ram.id= :id")
    @Transactional(readOnly = true)
    ram findByID(@Param("id") String id);
}
