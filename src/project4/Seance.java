/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

import java.sql.Blob;

/**
 *
 * @author marwa
 */
public class Seance {
    private int id;
    private String date_seance;
    private int heure;
    private int salle;
    private int id_film;
    
    public Seance() {
    }

    public Seance(int id, String date_seance, int heure, int salle, int id_film) {
        this.id = id;
        this.date_seance = date_seance;
        this.heure = heure;
        this.salle = salle;
        this.id_film = id_film;
        
    }

  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getdate_seance() {
        return date_seance;
    }

    public void setdate_seance(String date_seance) {
        this.date_seance = date_seance;
    }

    public int getheure() {
        return heure;
    }

    public void setheure(int heure) {
        this.heure = heure;
    }


    public int getsalle() {
        return salle;
    }

    public void setsalle(int salle) {
        this.salle = salle;
    }
    
    public int getid_film() {
        return id_film;
    }

    public void setid_film(int id_film) {
        this.id_film = id_film;
    }

  

    @Override
    public String toString() {
        return "Client{" + "id_seance=" + id + ", date_seance=" + date_seance + ", heure=" + heure + ", salle=" + salle + ",id_film=" + id_film +'}';
    }
}
