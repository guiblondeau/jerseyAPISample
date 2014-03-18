package com.example.representation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guillaume on 18/03/14.
 */
public class SocieteRepresentationBuilder {

    private static Integer idIncrement = new Integer(1);

    private static List<SocieteRepresentation> societe = new ArrayList<>();

    public static void addSociete(SocieteRepresentation societe) {
        if (societe.getId() == null) {
            societe.setId(idIncrement.toString());
            idIncrement ++;
        }
        SocieteRepresentationBuilder.societe.add(societe);
    }

    public static List<SocieteRepresentation> getSocietes(){
        return societe;
    }

    public static SocieteRepresentation getSociete(String id) {
        for (SocieteRepresentation societe : SocieteRepresentationBuilder.societe) {
            if (societe.getId().equals(id)){
                return societe;
            }
        }
        return null;
    }
}
