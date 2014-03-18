package com.example.resources;

import com.example.representation.CompteRepresentation;
import com.example.representation.CompteRepresentationBuilder;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by guillaume on 18/03/14.
 */
@Path("comptes/")
@Produces({MediaType.APPLICATION_JSON})
public class CompteResource {

    @GET
    public List<CompteRepresentation> getComptes() {
        return CompteRepresentationBuilder.getComptes();
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public CompteRepresentation addCompte(CompteRepresentation compte) {
        CompteRepresentationBuilder.addCompte(compte);
        return compte;
    }

    @Path("{id}")
    @GET
    public CompteRepresentation getCompte(@PathParam("id") String id) {
        return CompteRepresentationBuilder.getCompte(id);
    }

}
