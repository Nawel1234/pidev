/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.services;

import com.esprit.entities.Evenement;
import com.esprit.utils.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nawel
 */
public class ServiceEvenement {
    
    private Connection cnx = DataSource.getInstance().getCnx();
    
    public void ajouter(Evenement E) {
        try {
            String req = "INSERT INTO Evenement(nom, date, description, localisation) VALUES (?,?, ?, ?);";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setString(1, E.getNom());
            pst.setDate(2,  E.getDate());
            pst.setString(3, E.getDescription());
            pst.setString(4, E.getLocalisation());
            
            pst.executeUpdate();
            System.out.println("Evenement ajouté !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void modifier(Evenement E) {
        try {
            String req = "UPDATE Evenement SET nom=?, date=?, description=?, localisation=? WHERE idEvenement=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setString(1, E.getNom());
            pst.setDate(2, E.getDate());
            pst.setString(3, E.getDescription());
            pst.setString(4, E.getLocalisation());
            pst.setInt(5, E.getIdEvenement());
            pst.executeUpdate();
            System.out.println("Evenement modifié !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void supprimer(Evenement E) {
        try {
            String req = "DELETE from Evenement WHERE idEvenement=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, E.getIdEvenement());
            pst.executeUpdate();
            System.out.println("Evenement supprimé !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public List<Evenement> afficher() {
        List<Evenement> list = new ArrayList<>();
        
        String req = "SELECT * FROM Evenement";
        try {
            PreparedStatement pst = cnx.prepareStatement(req);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                list.add(new Evenement(rs.getInt("idEvenement"), rs.getString("nom"), rs.getDate("date") , rs.getString("description"), rs.getString("localisation")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        return list;
    }
}


