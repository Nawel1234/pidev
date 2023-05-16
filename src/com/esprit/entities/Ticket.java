/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.entities;

/**
 *
 * @author Nawel
 */
public class Ticket {
    private int idTicket;
    private float prix;
    private int idEvenement;
    private int idUser;

    public Ticket(float prix, int idEvenement, int idUser) {
        this.prix = prix;
        this.idEvenement = idEvenement;
        this.idUser = idUser;
    }

    public Ticket(int idTicket, float prix, int idEvenement, int idUser) {
        this.idTicket = idTicket;
        this.prix = prix;
        this.idEvenement = idEvenement;
        this.idUser = idUser;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public float getPrix() {
        return prix;
    }

    public int getIdEvenement() {
        return idEvenement;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setIdEvenement(int idEvenement) {
        this.idEvenement = idEvenement;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return "Ticket{" + "idTicket=" + idTicket + ", prix=" + prix + ", idEvenement=" + idEvenement + ", idUser=" + idUser + '}';
    }
    
    
}
