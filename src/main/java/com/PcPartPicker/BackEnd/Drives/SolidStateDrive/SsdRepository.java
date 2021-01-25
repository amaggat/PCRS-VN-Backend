package com.PcPartPicker.BackEnd.Drives.SolidStateDrive;

import com.PcPartPicker.BackEnd.Drives.SolidStateDrive.SolidStateDrive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

public interface SsdRepository extends JpaRepository<SolidStateDrive, String>, JpaSpecificationExecutor<SolidStateDrive> {

    @Query("SELECT DISTINCT ssd FROM SolidStateDrive ssd WHERE ssd.id = :id")
    @Transactional(readOnly = true)
    SolidStateDrive findByID(@Param("id") String id);

}
