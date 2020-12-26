package com.PcPartPicker.BackEnd.Drives.HardDriveDisk;

import com.PcPartPicker.BackEnd.Drives.HardDriveDisk.HardDiskDrive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

public interface HddRepository extends JpaRepository<HardDiskDrive, Integer> {

    @Query("SELECT DISTINCT hdd FROM HardDiskDrive hdd WHERE hdd.id= :id")
    @Transactional(readOnly = true)
    HardDiskDrive findByID(@Param("id") String id);

    @Query("SELECT DISTINCT hdd FROM HardDiskDrive hdd WHERE hdd.manufacturer= :manufacturer")
    @Transactional(readOnly = true)
    List<HardDiskDrive> findByManufacturer(@Param("manufacturer") String manufacturer);

    @Query("SELECT DISTINCT hdd FROM HardDiskDrive hdd WHERE hdd.size= :size")
    @Transactional(readOnly = true)
    List<HardDiskDrive> findBySize(@Param("size") String size);

    @Query("SELECT DISTINCT hdd FROM HardDiskDrive hdd WHERE hdd.fullname LIKE %:fullname%")
    @Transactional(readOnly = true)
    List<HardDiskDrive> findByName(@Param("fullname") String fullname);

//    void save(HardDiskDrive hdd);


    @Query("SELECT DISTINCT hdd FROM HardDiskDrive hdd")
    @Transactional(readOnly = true)
    List<HardDiskDrive> findAll();
}
