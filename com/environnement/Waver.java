package com.environnement;

public class Waver extends Vehicule{

    private String genre;

    public Waver(){
        this.genre = "waver";
        this.speed = "noeud";
    } 

    public void deplacer(){
        System.out.println("Je me déplace");
    }
    public void deplacerXY(){
        System.out.printlnXY("Je me déplace en "+ x + y);
    }
}
