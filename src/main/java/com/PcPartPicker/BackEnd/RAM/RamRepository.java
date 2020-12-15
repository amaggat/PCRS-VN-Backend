package com.PcPartPicker.BackEnd.RAM;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public interface RamRepository extends Repository<ram, Integer> {

    @Query("SELECT DISTINCT ram From ram ram WHERE ram.id= :id")
    @Transactional(readOnly = true)
    ram findByID(@Param("id") int id);

    @Query("SELECT DISTINCT ram From ram ram WHERE ram.manufacturer LIKE %:manufacturer%")
    @Transactional(readOnly = true)
    Collection<ram> findByManufacturer(@Param("manufacturer") String manufacturer);

    @Query("SELECT DISTINCT ram From ram ram WHERE ram.fullname LIKE %:fullname%")
    @Transactional(readOnly = true)
    Collection<ram> findByName(@Param("fullname") String fullName);

    @Query("SELECT DISTINCT ram From ram ram WHERE ram.sizeOfRam= :sizeOfName")
    @Transactional(readOnly = true)
    Collection<ram> findBySize(@Param("sizeOfName") int size);

    @Query("SELECT DISTINCT ram From ram ram WHERE ram.clockSpeed= :clockSpeed")
    @Transactional(readOnly = true)
    Collection<ram> findByClockSpeed(@Param("clockSpeed") int clockSpeed);

    void save(ram ram);
}
