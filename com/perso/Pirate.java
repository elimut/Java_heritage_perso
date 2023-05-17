package com.perso;

public class Pirate {
    protected String name;
    protected int posX;
    protected int posY;

    public Pirate(String name)
    {
        this.name = name;
        this.posX = 30;
        this.posY = 30;
        // position, 30px
    }

    public void move(int x, int y)
    {
        this.posX = x;
        this.posY = y;
        System.out.println("Le pirate se déplace en x" + ""+ this.posX +""+ "et en y" +"" +this.posY);
    }
    
}
