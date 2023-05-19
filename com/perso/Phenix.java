package com.perso;

public final class Phenix extends HommePoisson {

    private int posZ;

    public  Phenix(String name) {
        super(name);
    }
    
    public void fly(int x, int y, int z)
    {
        // super.swim(x, y, z);
        System.out.println(name + ""+ "le phenix se déplace en x, y, z:"+" " + posX + " " + posY + " " + posZ);
    }

    public String getName() {
        return name;
    }
}
