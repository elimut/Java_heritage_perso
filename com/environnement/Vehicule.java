package com.environnement;

abstract public class Vehicule {
// mot clef abstract qui définit la classe abstraite
    protected String speed;

    abstract public void deplacer();
    // méthode abstraite, non implémentée
    abstract public void deplacerXY(int x, int y);
        // méthode abstraite, non implémentée
}
