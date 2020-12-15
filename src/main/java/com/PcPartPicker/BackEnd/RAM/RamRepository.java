package com.PcPartPicker.BackEnd.RAM;


import com.PcPartPicker.BackEnd.RAM.RAM;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

public interface RamRepository extends Repository<RAM, Integer> {

    List<RAM> findRAM();

    @Query("SELECT DISTINCT ram From RAM ram WHERE ram.id= :id")
    @Transactional(readOnly = true)
    RAM findByID(@Param("id") int id);

    @Query("SELECT DISTINCT ram From RAM ram WHERE ram.manufacturer LIKE %:manufacturer%")
    @Transactional(readOnly = true)
    Collection<RAM> findByManufacturer(@Param("manufacturer") String manufacturer);

    @Query("SELECT DISTINCT ram From RAM ram WHERE ram.fullname LIKE %:fullName%")
    @Transactional(readOnly = true)
    Collection<RAM> findByName(@Param("fullName") String fullName);

    @Query("SELECT DISTINCT ram From RAM ram WHERE ram.sizeOfRam= :sizeOfName")
    @Transactional(readOnly = true)
    Collection<RAM> findBySize(@Param("sizeOfName") int size);

    @Query("SELECT DISTINCT ram From RAM ram WHERE ram.clockSpeed= :clockSpeed")
    @Transactional(readOnly = true)
    Collection<RAM> findByClockSpeed(@Param("clockSpeed") int clockSpeed);

    void save(RAM ram);
}
