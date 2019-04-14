package com.test.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import com.test.struts.beans.Database;
import com.test.struts.beans.User;

import java.sql.Statement;

public class InscriptionAction extends ActionSupport {

    private User user = new User();
    private String confirmation;
    Database data = new Database();
    Statement st = data.connect_to_Database();

    public String addUser() {

        String result = ActionSupport.INPUT;

        if (this.user != null) {


            if (user.getNom().length() < 3)
                addFieldError("user.name", "Votre nom doit être plus grand que 3 charactère.");

            if (!user.getEmail().matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
                addFieldError("user.email", "Merci de saisir un email valide.");
            }

            if (user.getMotdepasse().length() < 3) {
                addFieldError("user.motdepasse", "Votre mot de passe doit être de plus de 3 charactère.");
            }
            if (!user.getMotdepasse().equals(confirmation)) {
                addFieldError("confirmation", "Les mots de passe doivent être identiques");
            }
            if (!this.hasErrors()){
                //ajouter utilisateur à la base de données

                data.addUsertoData(user, st);

                result = ActionSupport.SUCCESS;
            }

        }

        return result;
    }

    public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
