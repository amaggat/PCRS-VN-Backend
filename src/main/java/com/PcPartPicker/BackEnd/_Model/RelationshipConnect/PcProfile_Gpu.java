package com.PcPartPicker.BackEnd._Model.RelationshipConnect;



import com.PcPartPicker.BackEnd.GraphicCards.gpu;
import com.PcPartPicker.BackEnd._Model.PcProfile;
import com.PcPartPicker.BackEnd._Model.RelationshipConnect.Key.GpuKey;

import javax.persistence.*;


@Entity
public class PcProfile_Gpu {

    @EmbeddedId
    GpuKey id;

    @ManyToOne
    @MapsId("PcProfileID")
    @JoinColumn(name = "PcID")
    PcProfile pcProfile;

    @ManyToOne
    @MapsId("GpuID")
    @JoinColumn(name = "GpuID")
    gpu gpu;

    private int amount;
}
