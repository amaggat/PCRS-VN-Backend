package com.PcPartPicker.BackEnd.PSU;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

public interface PsuRepository extends Repository<PowerSupplyUnit, Integer> {

    @Query("SELECT DISTINCT psu FROM PowerSupplyUnit psu")
    @Transactional(readOnly = true)
    List<PowerSupplyUnit> findAll();

    @Query("SELECT DISTINCT psu FROM PowerSupplyUnit psu WHERE psu.id=:id")
    PowerSupplyUnit findByID(@Param("id") int id);

    @Query("SELECT DISTINCT psu FROM PowerSupplyUnit psu WHERE psu.manufacturer=:manufacturer")
    @Transactional(readOnly = true)
    Collection<PowerSupplyUnit> findByManufacturer(@Param("manufacturer")String manufacturer);

    @Query("SELECT DISTINCT psu FROM PowerSupplyUnit psu WHERE psu.fullname LIKE %:fullname%")
    @Transactional(readOnly = true)
    Collection<PowerSupplyUnit> findByName(@Param("fullname")String fullname);

    @Query("SELECT DISTINCT psu FROM PowerSupplyUnit psu WHERE psu.standard_80=:standard")
    @Transactional(readOnly = true)
    Collection<PowerSupplyUnit> findByStandard(@Param("standard") String standard);

    @Query("SELECT DISTINCT psu FROM PowerSupplyUnit psu WHERE psu.Power BETWEEN :min_power AND :max_power")
    @Transactional(readOnly = true)
    Collection<PowerSupplyUnit> findByPower(@Param("min_power") int min_power, @Param("max_power") int max_power);

    void save(PowerSupplyUnit psu);

}
