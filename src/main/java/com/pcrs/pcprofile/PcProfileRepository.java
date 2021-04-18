package com.pcrs.pcprofile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface PcProfileRepository extends JpaRepository<PcProfile, String>, JpaSpecificationExecutor<PcProfile> {

    @Query("SELECT DISTINCT pcProfile FROM PcProfile pcProfile WHERE pcProfile.id= :id")
    @Transactional(readOnly = true)
    PcProfile findByID(String id);


}
