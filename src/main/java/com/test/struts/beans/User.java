package com.test.struts.beans;

public class User {
    private String email;
    private String motdepasse;
    private String nom;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
