package com.example.resources;

import com.example.representation.ContactRepresentation;
import com.example.representation.ContactRepresentationBuilder;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by guillaume on 18/03/14.
 */
@Path("contacts/")
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public class ContactResource {

    @RolesAllowed("admin")
    @GET
    public List<ContactRepresentation> getContacts() {
        return ContactRepresentationBuilder.getContacts();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public ContactRepresentation addContact(ContactRepresentation contact){
        ContactRepresentationBuilder.addContact(contact);
        return contact;
    }

    @GET
    @Path("{id}")
    public ContactRepresentation getContact(@PathParam("id") String id) {
        return ContactRepresentationBuilder.getContact(id);
    }

}
