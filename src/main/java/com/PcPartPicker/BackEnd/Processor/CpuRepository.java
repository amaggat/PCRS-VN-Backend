package com.PcPartPicker.BackEnd.Processor;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;


public interface CpuRepository extends Repository<cpu, Integer> {

    @Query("SELECT DISTINCT cpu FROM cpu cpu WHERE cpu.id= :id")
    @Transactional(readOnly = true)
    cpu findByID(@Param("id") String id);

    @Query("SELECT DISTINCT cpu FROM cpu cpu WHERE cpu.manufacturer= :manufacturer")
    @Transactional(readOnly = true)
    Collection<cpu> findByManufacturer(@Param("manufacturer") String manufacturer);

    @Query("SELECT DISTINCT cpu FROM cpu cpu WHERE cpu.fullname LIKE %:fullname%")
    @Transactional(readOnly = true)
    Collection<cpu> findByName(@Param("fullname") String fullname);

    @Query("SELECT DISTINCT cpu FROM cpu cpu WHERE cpu.Cores= :Cores")
    @Transactional(readOnly = true)
    Collection<cpu> findByCores(@Param("Cores") int Cores);

    @Query("SELECT DISTINCT cpu FROM cpu cpu WHERE cpu.chipset= :chipset")
    @Transactional(readOnly = true)
    Collection<cpu> findByChipset(@Param("chipset") String chipset);

    void save(cpu cpu);

    @Query("SELECT DISTINCT cpu FROM cpu cpu")
    @Transactional(readOnly = true)
    List<cpu> findAll();
}
