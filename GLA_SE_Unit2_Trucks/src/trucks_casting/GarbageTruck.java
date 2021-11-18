package trucks_casting;
public class GarbageTruck extends Truck{

    private String entity;

    public GarbageTruck (Engine engine, String entity){
        super(engine);
        this.entity = entity;
    }

    protected String hookBin(){
        return "Got a bin here";
    }

    protected String lift(){
        return "Lifting bins";
    }

    protected String fix(){
        return "I'm repairing the " + entity;
    }
}
