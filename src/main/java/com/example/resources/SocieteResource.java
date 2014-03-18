package com.example.resources;

import com.example.representation.ContactRepresentation;
import com.example.representation.ContactRepresentationBuilder;
import com.example.representation.SocieteRepresentation;
import com.example.representation.SocieteRepresentationBuilder;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by guillaume on 18/03/14.
 */
@Path("societes/")
@Produces({MediaType.APPLICATION_JSON})
public class SocieteResource {

    @GET
    public List<SocieteRepresentation> getSocietes() {
        //return ContactRepresentationBuilder.getContacts().toString();
        return SocieteRepresentationBuilder.getSocietes();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public SocieteRepresentation addSociete(SocieteRepresentation societe){
        SocieteRepresentationBuilder.addSociete(societe);
        return societe;
    }

    @GET
    @Path("{id}")
    public SocieteRepresentation getSociete(@PathParam("id") String id) {
        return SocieteRepresentationBuilder.getSociete(id);
    }

    @GET
    @Path("{id}/contacts/")
    public List<ContactRepresentation> getContacts(@PathParam("id") String id) {
        return ContactRepresentationBuilder.getContactsFromSociete(id);
    }


}
