/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.esprit.tests;

import com.esprit.entities.Evenement;
import com.esprit.entities.Ticket;
import com.esprit.services.ServiceEvenement;
import com.esprit.services.ServiceTicket;
import java.sql.Date;

/**
 *
 * @author Nawel
 */
public class MainProg {
public static void main(String[] args) {
      ServiceEvenement SE = new ServiceEvenement();
      //System.out.println(SE.afficher());
     // SE.ajouter(new Evenement("dance", new Date(10, 05, 2023), "extraordinaire", "tunis"));
   // ServiceTicket ST= new ServiceTicket();
   // System.out.println(ST.afficher());
   // ST.ajouter(new Ticket(1,2f, 3, 1));
   //ServiceEvenement SE = new ServiceEvenement();
   //SE.modifier(new Evenement(1, "sport", java.sql.Date.valueOf("2023-05-15"), "super", "bizerte"));
   
  // SE.supprimer(new Evenement(1, "sport", java.sql.Date.valueOf("2023-05-15"), "super", "bizerte"));
  
   
   System.out.println(SE.afficher());
    
}

}
   
