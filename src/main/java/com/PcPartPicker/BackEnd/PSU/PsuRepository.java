package com.PcPartPicker.BackEnd.PSU;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

public interface PsuRepository extends JpaRepository<PowerSupplyUnit, Integer> {

    @Query("SELECT DISTINCT psu FROM PowerSupplyUnit psu")
    @Transactional(readOnly = true)
    List<PowerSupplyUnit> findAll();

    @Query("SELECT DISTINCT psu FROM PowerSupplyUnit psu WHERE psu.id=:id")
    PowerSupplyUnit findByID(@Param("id") String id);

    @Query("SELECT DISTINCT psu FROM PowerSupplyUnit psu WHERE psu.manufacturer=:manufacturer")
    @Transactional(readOnly = true)
    List<PowerSupplyUnit> findByManufacturer(@Param("manufacturer") String manufacturer);

    @Query("SELECT DISTINCT psu FROM PowerSupplyUnit psu WHERE psu.fullname LIKE %:fullname%")
    @Transactional(readOnly = true)
    List<PowerSupplyUnit> findByName(@Param("fullname") String fullname);

    @Query("SELECT DISTINCT psu FROM PowerSupplyUnit psu WHERE psu.standard_80=:standard")
    @Transactional(readOnly = true)
    List<PowerSupplyUnit> findByStandard(@Param("standard") String standard);

    @Query("SELECT DISTINCT psu FROM PowerSupplyUnit psu WHERE psu.Power BETWEEN :min_power AND :max_power")
    @Transactional(readOnly = true)
    List<PowerSupplyUnit> findByPower(@Param("min_power") int min_power, @Param("max_power") int max_power);

}
