package com.PcPartPicker.BackEnd._Model.RelationshipConnect;


import com.PcPartPicker.BackEnd.PSU.PowerSupplyUnit;
import com.PcPartPicker.BackEnd._Model.PcProfile;
import com.PcPartPicker.BackEnd._Model.RelationshipConnect.Key.PsuKey;

import javax.persistence.*;



@Entity
public class PcProfile_Psu {

    @EmbeddedId
    PsuKey id;

    @ManyToOne
    @MapsId("PcProfileID")
    @JoinColumn(name = "PcID")
    PcProfile pcProfile;

    @ManyToOne
    @MapsId("PsuID")
    @JoinColumn(name = "PsuID")
    PowerSupplyUnit powerSupplyUnit;

    final int amount = 1;

}
