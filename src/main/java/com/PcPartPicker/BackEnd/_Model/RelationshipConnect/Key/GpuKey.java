package com.PcPartPicker.BackEnd._Model.RelationshipConnect.Key;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class GpuKey implements Serializable {

    @Column(name = "PcID")
    String PcProfileID = new String();

    @Column(name = "GpuID")
    String GpuID = new String();

}
