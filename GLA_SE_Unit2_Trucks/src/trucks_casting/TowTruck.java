package trucks_casting;
import java.util.ArrayList;

public class TowTruck extends Truck{

    public TowTruck (Engine engine){
        super(engine);
    }

    protected String hookCar(){
        return "Got that car!";
    }

    protected String tow(){
        return "Heave, heave!";
    }

}
