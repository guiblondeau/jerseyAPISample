package com.example.representation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by guillaume on 18/03/14.
 */
public class CompteRepresentationBuilder {

    private static AtomicInteger increment = new AtomicInteger();

    private static List<CompteRepresentation> comptes = new ArrayList<>();

    public static List<CompteRepresentation> getComptes(){
        return comptes;
    }

    public static CompteRepresentation getCompte(String id){
        for (CompteRepresentation compte : comptes){
            if (compte.getId().equals(id)){
                return compte;
            }
        }
        return null;
    }

    public static void addCompte(CompteRepresentation compte){
        if (compte.getId() == null){
            compte.setId(""+increment.getAndIncrement());
        }
        comptes.add(compte);
    }
}
