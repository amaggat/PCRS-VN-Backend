package com.PcPartPicker.BackEnd._Model.RelationshipConnect;

import com.PcPartPicker.BackEnd.Drives.SolidStateDrive.SolidStateDrive;
import com.PcPartPicker.BackEnd._Model.PcProfile;
import com.PcPartPicker.BackEnd._Model.RelationshipConnect.Key.MainKey;

import javax.persistence.*;


@Entity
public class PcProfile_Ssd {

    @EmbeddedId
    MainKey id;

    @ManyToOne
    @MapsId("PcProfileID")
    @JoinColumn(name = "PcID")
    PcProfile pcProfile;

    @ManyToOne
    @MapsId("SsdID")
    @JoinColumn(name = "SsdID")
    SolidStateDrive Ssd;

    private int amount;
}
