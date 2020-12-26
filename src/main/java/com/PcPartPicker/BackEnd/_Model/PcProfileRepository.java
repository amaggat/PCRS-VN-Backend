package com.PcPartPicker.BackEnd._Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


import java.util.Collection;
import java.util.List;

public interface PcProfileRepository extends JpaRepository<PcProfile, String>, JpaSpecificationExecutor<PcProfile> {

//    @Query("SELECT DISTINCT pcProfile FROM PcProfile pcProfile WHERE pcProfile.PcName LIKE %:PcName%")
//    @Transactional(readOnly = true)
//    List<PcProfile> findByName(@RequestParam("PcName") String PcName);

    @Query("SELECT DISTINCT pcProfile FROM PcProfile pcProfile WHERE pcProfile.id= :id")
    @Transactional(readOnly = true)
    PcProfile findByID(String id);

//    PcProfile findByManufacturer(String manufacturer);

//    void save(PcProfile profile);



//    @Query("SELECT DISTINCT pcProfile FROM PcProfile pcProfile")
//    @Transactional(readOnly = true)
//    List<PcProfile> findAll();

}
