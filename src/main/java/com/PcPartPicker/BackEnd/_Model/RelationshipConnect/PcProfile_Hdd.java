package com.PcPartPicker.BackEnd._Model.RelationshipConnect;


import com.PcPartPicker.BackEnd.Drives.HardDriveDisk.HardDiskDrive;
import com.PcPartPicker.BackEnd._Model.PcProfile;
import com.PcPartPicker.BackEnd._Model.RelationshipConnect.Key.HddKey;

import javax.persistence.*;

@Entity
public class PcProfile_Hdd {

    @EmbeddedId
    HddKey id;

    @ManyToOne
    @MapsId("PcProfileID")
    @JoinColumn(name = "PcID")
    PcProfile pcProfile;

    @ManyToOne
    @MapsId("HddID")
    @JoinColumn(name = "HddID")
    HardDiskDrive hdd;

    private int amount;

}
