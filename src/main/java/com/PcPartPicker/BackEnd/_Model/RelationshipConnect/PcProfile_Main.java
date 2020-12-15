package com.PcPartPicker.BackEnd._Model.RelationshipConnect;

import com.PcPartPicker.BackEnd.Mainboard.Mainboard;
import com.PcPartPicker.BackEnd._Model.PcProfile;
import com.PcPartPicker.BackEnd._Model.RelationshipConnect.Key.MainKey;

import javax.persistence.*;

@Entity
public class PcProfile_Main {

    @EmbeddedId
    MainKey id;

    @ManyToOne
    @MapsId("PcProfileID")
    @JoinColumn(name = "PcID")
    PcProfile pcProfile;

    @ManyToOne
    @MapsId("MainID")
    @JoinColumn(name = "MainID")
    Mainboard main;

    final int amount = 1;

}
