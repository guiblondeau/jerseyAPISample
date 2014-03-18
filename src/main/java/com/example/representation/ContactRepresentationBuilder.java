package com.example.representation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by guillaume on 18/03/14.
 */
public class ContactRepresentationBuilder {

    private static AtomicInteger idIncrement = new AtomicInteger();

    private static List<ContactRepresentation> contacts = new ArrayList<>();

    public static void addContact(ContactRepresentation contact) {
        if (contact.getId() == null) {
            contact.setId(""+idIncrement.getAndIncrement());
        }
        contacts.add(contact);
    }

    public static List<ContactRepresentation> getContacts(){
        return contacts;
    }

    public static ContactRepresentation getContact(String id) {
        for (ContactRepresentation contact : contacts) {
            if (contact.getId().equals(id)){
                return contact;
            }
        }
        return null;
    }

    public static List<ContactRepresentation> getContactsFromSociete(String id) {
        List<ContactRepresentation> contacts = new ArrayList<>();
        for (ContactRepresentation contact : ContactRepresentationBuilder.contacts){
            if (contact.getSociete_id().equals(id)){
                contacts.add(contact);
            }
        }
        return contacts;
    }
}
