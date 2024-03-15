package org.example;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class GestionDeStock implements Observer {
    public String gestionStock;

    public GestionDeStock(String pGestionStock) {
        this.gestionStock = pGestionStock;
    }
    public void traite(String contenu) {

        System.out.println("G.DES.STOCKS:" + contenu.toString().toUpperCase());
    }


    public void update(Observable pSujetObservation, Object pObj) {
        if (pSujetObservation instanceof Panier.DeclenchementCommande)
            traite((String) pObj);

    }
}
