/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.entities;

import java.sql.Date;



/**
 *
 * @author Nawel
 */
public class Evenement {
    private int idEvenement;
    private String nom;
    private Date date;
    private String description;
    private String localisation;

    public Evenement(String nom, Date date, String description, String localisation) {
        this.nom = nom;
        this.date = date;
        this.description = description;
        this.localisation = localisation;
    }

    public Evenement(int idEvenement, String nom, Date date, String description, String localisation) {
        this.idEvenement = idEvenement;
        this.nom = nom;
        this.date = date;
        this.description = description;
        this.localisation = localisation;
    }

    public int getIdEvenement() {
        return idEvenement;
    }

    public String getNom() {
        return nom;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setIdEvenement(int idEvenement) {
        this.idEvenement = idEvenement;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    @Override
    public String toString() {
        return "Evenement{" + "idEvenement=" + idEvenement + ", nom=" + nom + ", date=" + date + ", description=" + description + ", localisation=" + localisation + '}';
    }

    
    
    }
    
    
    
    
    
    
            

