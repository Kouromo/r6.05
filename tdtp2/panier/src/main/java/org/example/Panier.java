package org.example;

import java.util.Observable;
public class Panier {
    private String contenu;
    private DeclenchementCommande sujetObservation = new Panier.DeclenchementCommande();

    public Panier (GestionDeStock pStock, Comptabilite pCompta) {
        this.getSujetObservation().addObserver(pCompta);
        this.getSujetObservation().addObserver(pStock);

        this.contenu = new String ("Contenu du panier");
    }

    public String getContenu() {
        return this.contenu;
    };


    /*public void declenchementCommande() {
        this.stock.traite(this.contenu);
        this.compta.traite(this.contenu);
    }*/

    public Comptabilite getCompta() {
        return this.compta;
    }

    public GestionDeStock getStock() {
        return this.stock;
    }

    class DeclenchementCommande extends Observable {

        this.sujetObservation;
        /*
        * If a class had no notifier (the default, class known as package-private),
        * It is visible only within its own package (packages are named groups of related classes).
        */

           public void notifyObservers() {
               super.setChanged();
               super.notifyObservers();
           }

           public void notifyObservers(Object arg) {
               super.setChanged();
               super.notifyObservers(arg);
           }

           public boolean hasChanged() {
               return super.hasChanged();
           }
    }
}
