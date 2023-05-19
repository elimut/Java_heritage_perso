import com.perso.*;
import com.environnement.*;
public class App {
    public static void main(String[] args)
    {
        Pirate luffy = new Pirate("Luffy");
        HommePoisson ariel = new HommePoisson("Ariel");
        Phenix marco = new Phenix("marco");
        luffy.move(32, 30);
        System.out.println(luffy);
        System.out.println(ariel);
        ariel.swim(32, 30, -10);
        marco.fly(30, 30, 30);
        Bateau boat = new Bateau();
        System.out.println(boat);
        boat.deplacer();
    }
}
