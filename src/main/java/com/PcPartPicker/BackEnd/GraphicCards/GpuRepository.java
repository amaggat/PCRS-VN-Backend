package com.PcPartPicker.BackEnd.GraphicCards;

import com.PcPartPicker.BackEnd.GraphicCards.GraphicsProcessingUnit;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public interface GpuRepository extends Repository<GraphicsProcessingUnit, Integer> {

    Collection<GraphicsProcessingUnit> findGPU();

    @Query("SELECT DISTINCT gpu FROM GraphicsProcessingUnit gpu WHERE gpu.id =:id")
    @Transactional(readOnly = true)
    GraphicsProcessingUnit findByID(@Param("id") int id);

    @Query("SELECT DISTINCT gpu from GraphicsProcessingUnit gpu WHERE gpu.chipset =:chipset")
    @Transactional(readOnly = true)
    Collection<GraphicsProcessingUnit> findByChipset(@Param("chipset") String chipset);

    @Query("SELECT DISTINCT gpu FROM GraphicsProcessingUnit gpu WHERE gpu.manufacturer =:manufacturer")
    @Transactional(readOnly = true)
    Collection<GraphicsProcessingUnit> findByManufacturer(@Param("manufacturer") String manufacturer);

    @Query("SELECT DISTINCT gpu FROM GraphicsProcessingUnit gpu WHERE gpu.VRam =:VRam")
    @Transactional(readOnly = true)
    Collection<GraphicsProcessingUnit> findByVRam(@Param("VRam") int VRam);

    @Query("SELECT DISTINCT gpu FROM GraphicsProcessingUnit gpu WHERE gpu.fullname LIKE %:fullName%")
    Collection<GraphicsProcessingUnit> findByName(@Param("fullName") String fullName);

    void save(GraphicsProcessingUnit gpu);

}
