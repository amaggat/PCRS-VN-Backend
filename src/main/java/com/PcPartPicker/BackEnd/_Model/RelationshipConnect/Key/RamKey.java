package com.PcPartPicker.BackEnd._Model.RelationshipConnect.Key;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class RamKey implements Serializable {

    @Column(name = "PcID")
    String PcProfileID = new String();

    @Column(name = "RamID")
    String RamID = new String();

}
