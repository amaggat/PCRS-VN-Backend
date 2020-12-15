package com.PcPartPicker.BackEnd._Model.RelationshipConnect.Key;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class MainKey implements Serializable {

    @Column(name = "PcID")
    String PcProfileID = new String();

    @Column(name = "MainID")
    String MainID = new String();

}
