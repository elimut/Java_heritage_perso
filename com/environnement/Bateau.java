package com.environnement;

public class Bateau extends Vehicule{

    private String genre;

    public Bateau(){
        this.genre = "bateau";
        this.speed = "noeud";
    } 
    public void deplacer(){
        System.out.println("Je me déplace");
    // récupération de la méthode abstraite de la classe Vehicule, et implémentation => devient concrète
    }
    public void deplacerXY(int x, int y){
        System.out.println("Je me déplace de " + x + y);
    }
}
