/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

import static com.oracle.jrockit.jfr.ContentType.Bytes;
import java.sql.Blob;

/**
 *
 * @author marwa
 */
public class Film {
    private int id;
    private String nom;
    private int nb_seance;
    private int id_employe;
    private Blob image;
    
    public Film() {
    }

    public Film(int id, String nom, int nb_seance, int id_employe, Blob image) {
        this.id = id;
        this.nom = nom;
        this.nb_seance = nb_seance;
        this.id_employe = id_employe;
        this.image = image;
        
    }

  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getnb_seance() {
        return nb_seance;
    }

    public void setnb_seance(int nb_seance) {
        this.nb_seance = nb_seance;
    }


    public int getid_employe() {
        return id_employe;
    }

    public void setid_employe(int id_employe) {
        this.id_employe = id_employe;
    }
    
    public Blob getimage() {
        return image;
    }

    public void setimage(Blob image) {
        this.image = image;
    }

  

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", nom=" + nom + ", nb_seance=" + nb_seance + ", id_employe=" + id_employe + ",image=" + image +'}';
    }

}


