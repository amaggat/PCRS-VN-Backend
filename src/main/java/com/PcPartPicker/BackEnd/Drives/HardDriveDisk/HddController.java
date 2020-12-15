package com.PcPartPicker.BackEnd.Drives.HardDriveDisk;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HddController {
    private final HddRepository hddRepository;

    public HddController(HddRepository hddRepository)
    {
        this.hddRepository = hddRepository;
    }
}
