package com.PcPartPicker.BackEnd.Processor;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CpuController {

    private final CpuRepository cpuRepository;
    private final cpuPriceListRepository cpuPriceListRepository;

    public CpuController(CpuRepository cpuRepository, cpuPriceListRepository cpuPriceListRepository) {
        this.cpuRepository = cpuRepository;
        this.cpuPriceListRepository = cpuPriceListRepository;
    }

    @GetMapping("/cpu")
    public List<cpu> list(){
        return cpuRepository.findAll();
    }

    @GetMapping("/api/cpu/find/name={CpuName}")
    public List<cpu> SearchByName(@PathVariable("CpuName") String name)
    {
        return cpuRepository.findByName(name);
    }

    @GetMapping("/api/cpu/find/socket={CpuSocket}")
    public List<cpu> SearchBySocket(@PathVariable("CpuSocket") String socket)
    {
        return cpuRepository.findBySocket(socket);
    }

    @GetMapping("/api/cpu/{CpuID}")
    public cpu SearchById(@PathVariable("CpuID") String id)
    {
        return cpuRepository.findByID(id);
    }

    @GetMapping("/api/cpu/{CpuID}/price")
    public List<cpuPriceList> ReturnPriceList(@PathVariable("CpuID") String fid)
    {
        return cpuPriceListRepository.findcpuPriceListByFid(fid);
    }
}
