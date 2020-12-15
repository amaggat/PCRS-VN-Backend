package com.PcPartPicker.BackEnd.GraphicCards;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public interface GpuRepository extends Repository<gpu, Integer> {

    @Query("SELECT DISTINCT gpu FROM gpu gpu WHERE gpu.id =:id")
    @Transactional(readOnly = true)
    gpu findByID(@Param("id") int id);

    @Query("SELECT DISTINCT gpu from gpu gpu WHERE gpu.chipset =:chipset")
    @Transactional(readOnly = true)
    Collection<gpu> findByChipset(@Param("chipset") String chipset);

    @Query("SELECT DISTINCT gpu FROM gpu gpu WHERE gpu.manufacturer =:manufacturer")
    @Transactional(readOnly = true)
    Collection<gpu> findByManufacturer(@Param("manufacturer") String manufacturer);

    @Query("SELECT DISTINCT gpu FROM gpu gpu WHERE gpu.VRam =:VRam")
    @Transactional(readOnly = true)
    Collection<gpu> findByVRam(@Param("VRam") int VRam);

    @Query("SELECT DISTINCT gpu FROM gpu gpu WHERE gpu.fullname LIKE %:fullname%")
    Collection<gpu> findByName(@Param("fullname") String fullname);

    void save(gpu gpu);

}
