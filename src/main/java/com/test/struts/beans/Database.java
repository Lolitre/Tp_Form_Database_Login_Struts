package com.test.struts.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    public Statement connect_to_Database() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection cnx = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "admin", "wdyd");
            Statement st = cnx.createStatement();
            return (st);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;

    }

    public void addUsertoData(User user, Statement st) {

        String email = user.getEmail();
        String mdp = user.getMotdepasse();
        String nom = user.getNom();

        try {
            st.execute("insert into users (email, mdp, nom) values ('"+email+"', '"+mdp+"', '"+nom+"')");

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

