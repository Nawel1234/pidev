/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.services;

import com.esprit.entities.Ticket;
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
public class ServiceTicket {
  
    private Connection cnx = DataSource.getInstance().getCnx();
    
    public void ajouter(Ticket T) {
        try {
            String req = "INSERT INTO Ticket(prix, idEvenement,idUser) VALUES (?,?,?);";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setFloat(1, T.getPrix());
            pst.setInt(2, T.getIdEvenement());
            pst.setInt(3, T.getIdUser());
            pst.executeUpdate();
            System.out.println("Ticket ajouté !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void modifier(Ticket T) {
        try {
            String req = "UPDATE Ticket SET prix=?, idEvenement=?, idUser WHERE idTicket=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setFloat(1, T.getPrix());
            pst.setInt(2, T.getIdEvenement());
            pst.setInt(3, T.getIdUser());
            pst.setInt(3, T.getIdTicket());
            pst.executeUpdate();
            System.out.println("Ticket modifié !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void supprimer(Ticket T) {
        try {
            String req = "DELETE from Ticket WHERE idTicket=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, T.getIdTicket());
            pst.executeUpdate();
            System.out.println("Ticket supprimé !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public List<Ticket> afficher() {
        List<Ticket> list = new ArrayList<>();
        
        String req = "SELECT * FROM Ticket";
        try {
            PreparedStatement pst = cnx.prepareStatement(req);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                list.add(new Ticket(rs.getInt("idTicket"), rs.getFloat("prix"), rs.getInt("IdEvenement"),rs.getInt("IdUser")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        return list;
    }
}

    

