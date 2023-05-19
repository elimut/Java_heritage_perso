package com.perso;

public class Combattant extends EtreVivant{

    public Combattant(){
        race = "combattant";
    }

    public void respirer(){
        System.out.println("combattant respire normalement");
    }
    // toutes les méthodes abstraites doivent être utilisées dans les classes filles
}
// ne peut pas être instacié d' EtreVivant
