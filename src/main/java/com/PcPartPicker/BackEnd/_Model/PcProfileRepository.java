package com.PcPartPicker.BackEnd._Model;

import java.util.Collection;

public interface PcProfileRepository {

    Collection<PcProfile> findByName(String PcName);

    PcProfile findByID(String id);

//    PcProfile findByManufacturer(String manufacturer);

    void save(PcProfile profile);
}
