package com.PcPartPicker.BackEnd._Model.RelationshipConnect.Key;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SsdKey implements Serializable {

    @Column(name = "PcID")
    String PcProfileID = new String();

    @Column(name = "SsdID")
    String SsdID = new String();

}
