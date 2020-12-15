package com.PcPartPicker.BackEnd._Model.RelationshipConnect;



import com.PcPartPicker.BackEnd.Processor.CPU;
import com.PcPartPicker.BackEnd._Model.PcProfile;
import com.PcPartPicker.BackEnd._Model.RelationshipConnect.Key.CpuKey;

import javax.persistence.*;

@Entity
public class PcProfile_Cpu {

    @EmbeddedId
    CpuKey id;

    @ManyToOne
    @MapsId("PcProfileID")
    @JoinColumn(name = "PcID")
    PcProfile pcProfile;

    @ManyToOne
    @MapsId("CpuID")
    @JoinColumn(name = "CpuID")
    CPU processor;

    private int amount;

}
