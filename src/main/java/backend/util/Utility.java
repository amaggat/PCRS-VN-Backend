package backend.util;

import backend.model.ElectronicComponents;
import backend.pcprofile.PcProfile;
import backend.recommendation.type.rating.Rating;

import java.util.ArrayList;
import java.util.List;

public class Utility {

    public static List<String> returnPcProfileID(List<PcProfile> pcProfileList) {
        List<String> profileId = new ArrayList<>();

        for (PcProfile pcProfile : pcProfileList) {
            profileId.add(pcProfile.getId());
        }

        return profileId;
    }

    public static List<String> returnComponentIdList(List<ElectronicComponents> electronicComponentsList) {
        List<String> componentId = new ArrayList<>();

        for (ElectronicComponents electronicComponents : electronicComponentsList) {
            componentId.add(electronicComponents.getId());
        }

        return componentId;
    }
}
