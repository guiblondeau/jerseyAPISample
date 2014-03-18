package com.example.representation;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by guillaume on 18/03/14.
 */
@XmlRootElement(name = "Contact")
public class ContactRepresentation {

    private String civilite;

    private String email;

    private String fonction;

    private String id;

    private String ligne_directe;

    private String marche;

    private String nom;

    private String prenom;

    private String service;

    private String societe_id;

    private String sous_service;

    private String url_li_contact;

    public String getCivilite() {
        return civilite;
    }

    public String getEmail() {
        return email;
    }

    public String getFonction() {
        return fonction;
    }

    @XmlAttribute
    public String getId() {
        return id;
    }

    public String getLigne_directe() {
        return ligne_directe;
    }

    public String getMarche() {
        return marche;
    }

    @XmlElement
    public String getNom() {
        return nom;
    }

    @XmlElement
    public String getPrenom() {
        return prenom;
    }

    public String getService() {
        return service;
    }

    public String getSociete_id() {
        return societe_id;
    }

    public String getSous_service() {
        return sous_service;
    }

    public String getUrl_li_contact() {
        return url_li_contact;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLigne_directe(String ligne_directe) {
        this.ligne_directe = ligne_directe;
    }

    public void setMarche(String marche) {
        this.marche = marche;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setSociete_id(String societe_id) {
        this.societe_id = societe_id;
    }

    public void setSous_service(String sous_service) {
        this.sous_service = sous_service;
    }

    public void setUrl_li_contact(String url_li_contact) {
        this.url_li_contact = url_li_contact;
    }
}
