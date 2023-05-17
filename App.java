import com.perso.*;
public class App {
    public static void main(String[] args)
    {
        Pirate luffy = new Pirate("Luffy");
        HommePoisson ariel = new HommePoisson("Ariel");
        luffy.move(32, 30);
        System.out.println(luffy);
        System.out.println(ariel);
        ariel.swim(32, 30, 10);
    }
}
