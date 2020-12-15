package com.PcPartPicker.BackEnd._Model.RelationshipConnect;

import com.PcPartPicker.BackEnd.RAM.RAM;
import com.PcPartPicker.BackEnd._Model.PcProfile;
import com.PcPartPicker.BackEnd._Model.RelationshipConnect.Key.RamKey;

import javax.persistence.*;
import java.io.Serializable;

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
    RAM ram;

    private int amount;

}
