/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.esprit.services;

import java.util.List;

/**
 *
 * @author Nawel
 */

    public interface IService<T> {
    
    public void ajouter(T E);
    public void modifier(T E);
    public void supprimer(T E);
    public List<T> afficher();
}

