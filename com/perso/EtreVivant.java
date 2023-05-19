package com.perso;
import java.sql.Date;

public abstract class EtreVivant {
    protected String race;

    public String kezako(){
        return race;
    }
    
    abstract public void respirer();
    // méthode abstraite n'est pas implémentée

    public void naitre(Date date){
        System.out.println("Je suis né le " + date);
    }
    // peut avoir des méthodes concrètes
}
// pas de getter ni setter car rien à renvoyer => classe abstraite