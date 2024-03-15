package org.example;

import java.util.Observable;
import java.util.Observer;

public class Comptabilite implements Observer {
    public String comptabilite;

    public Comptabilite(String pComptabilite) {
        this.comptabilite = pComptabilite;
    }
    public void traite(String contenu) {
        System.out.println("comptabilité:" + contenu.toString().toLowerCase());
    }


    public void update(Observable pSujetObservation, Object pObj) {
        if (pSujetObservation instanceof Panier.DeclenchementCommande)
            traite((String) pObj);
    }
}
