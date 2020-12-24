package com.PcPartPicker.BackEnd._Model;

import org.hibernate.cache.spi.entry.StructuredCacheEntry;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

public interface PcProfileRepository extends Repository<PcProfile, String> {

    @Query("SELECT DISTINCT pcProfile FROM PcProfile pcProfile WHERE pcProfile.PcName LIKE %:PcName%")
    @Transactional(readOnly = true)
    List<PcProfile> findByName(@RequestParam("PcName") String PcName);

    @Query("SELECT DISTINCT pcProfile FROM PcProfile pcProfile WHERE pcProfile.id= :id")
    @Transactional(readOnly = true)
    PcProfile findByID(String id);

//    PcProfile findByManufacturer(String manufacturer);

    void save(PcProfile profile);

    @Query("SELECT DISTINCT pcProfile FROM PcProfile pcProfile")
    @Transactional(readOnly = true)
    List<PcProfile> findAll();

}
