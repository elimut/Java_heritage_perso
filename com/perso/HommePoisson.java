package com.perso;

public class HommePoisson {

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
}
