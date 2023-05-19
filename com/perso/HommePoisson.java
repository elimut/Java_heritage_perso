package com.perso;

public class HommePoisson extends Pirate {
/*
    private String name;
    private int posX;
    private int posY;
    private int posZ;
    
    public HommePoisson(String name)
    {
        this.name = name;
        this.posX = 30;
        this.posY = 30;
        this.posZ = 30;
    }

    public void move(int x, int y)
    {
        this.posX = x;
        this.posY = y;
        System.out.println("Le pirate se déplace en x" + this.posX + "et en y" + this.posY);
    }
    public void swim(int x, int y, int z)
    {
        this.posX = x;
        this.posY = y;
        this.posZ = z;
        System.out.println("Le pirate se déplace en x" + this.posX + "et en y" + this.posY + "et en z" + this.posZ);
    }
*/
// on va créer l'héritage. Dans la classe mère l'on mettra protected , les données seront privées sauf pour la classse qui hérite
    protected int posZ;
    
    public HommePoisson(String name)
    // posZ par défaut pas dans les arguments
    {
        super(name);
        this.posZ = -30;
    }

    /*
    public void swim(int x, int y, int z)
    {
        this.posX = x;
        this.posY = y;
        this.posZ = z;
        System.out.println("Le pirate se déplace en x" + this.posX + "et en y" + this.posY + "et en z" + this.posZ);
    }
    */

    public  void swim(int x, int y, int z)
    {
        // move( posX, posY);
        // super dans une methode ne sert qu'à la rédéfinition
        posX = x;
        posY = y;
        this.posZ = z;
        System.out.println("L'homme poisson se déplace en x, y, z:"+" " + posX + " " + posY + " " + this.posZ);
    // appel fontion move dans swim
    }

    /*
    // redéfinition méthode move
    public void move(int x, int y){
        super.move();
        redéf méthode
    }
    */

}
