package com.environnement;

public class Bateau extends Vehicule{

    private String genre;

    public Bateau(){
        this.genre = "bateau";
        this.speed = "noeud";
    } 
    public void deplacer(){
        System.out.println("Je me déplace");
    }
    public void deplacerXY(int x, int y){
        System.out.println("Je me déplace de " + x + y);
    }
}
