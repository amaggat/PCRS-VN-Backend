package com.PcPartPicker.BackEnd._Model.RelationshipConnect;

import com.PcPartPicker.BackEnd._Model.PcProfile;
import com.PcPartPicker.BackEnd._Model.RelationshipConnect.Key.RamKey;

import javax.persistence.*;

@Entity
public class PcProfile_Ram {

    @EmbeddedId
    RamKey id;

    @ManyToOne
    @MapsId("PcProfileID")
    @JoinColumn(name = "PcID")
    PcProfile pcProfile;

    @ManyToOne
    @MapsId("RamID")
    @JoinColumn(name = "RamID")
    com.PcPartPicker.BackEnd.RAM.ram ram;

    private int amount;

}
