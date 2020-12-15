package com.PcPartPicker.BackEnd.Drives.SolidStateDrive;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SsdController {

    private final SsdRepository ssdRepository;

    public SsdController(SsdRepository ssdRepository)
    {
        this.ssdRepository = ssdRepository;
    }
}
