package com.PcPartPicker.BackEnd.Processor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface cpuPriceListRepository extends JpaRepository<cpuPriceList, Integer> {


    @Query("SELECT DISTINCT cpuPriceList FROM cpuPriceList cpuPriceList WHERE cpuPriceList.cpu.id= :fid")
    @Transactional(readOnly = true)
    public List<cpuPriceList> findcpuPriceListByFid(@Param("fid") String fid);


}
