package com.PcPartPicker.BackEnd.Processor;


import com.PcPartPicker.BackEnd.Processor.CPU;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;


public interface CpuRepository extends Repository<CPU, Integer> {

    @Query("SELECT DISTINCT cpu FROM CPU cpu WHERE cpu.id= :id")
    @Transactional(readOnly = true)
    CPU findByID(@Param("id") String id);

    @Query("SELECT DISTINCT cpu FROM CPU cpu WHERE cpu.manufacturer= :manufacturer")
    @Transactional(readOnly = true)
    Collection<CPU> findByManufacturer(@Param("manufacturer") String manufacturer);

    @Query("SELECT DISTINCT cpu FROM CPU cpu WHERE cpu.fullname LIKE %:fullname%")
    @Transactional(readOnly = true)
    Collection<CPU> findByName(@Param("fullname") String fullname);

    @Query("SELECT DISTINCT cpu FROM CPU cpu WHERE cpu.Cores= :Cores")
    @Transactional(readOnly = true)
    Collection<CPU> findByCores(@Param("Cores") int Cores);

    @Query("SELECT DISTINCT cpu FROM CPU cpu WHERE cpu.chipset= :chipset")
    @Transactional(readOnly = true)
    Collection<CPU> findByChipset(@Param("chipset") String chipset);

    void save(CPU cpu);
}
