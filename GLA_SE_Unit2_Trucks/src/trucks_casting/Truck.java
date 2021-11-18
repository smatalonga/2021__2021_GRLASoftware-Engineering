package trucks_casting;
import java.util.ArrayList;

public class Truck extends Vehicle{

    private ArrayList<Wheel> wheels;
    private Engine engine;
    private String name;

    public Truck(Engine engine) {
        this.wheels = new ArrayList<Wheel>();
        this.engine = engine;
    }

    public ArrayList<Wheel> getWheel() {
        return this.wheels;
    }
    
    public void setName(String aName) {
    	this.name = aName;
    }
    
    public String getName() {
    	return this.name;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public ArrayList<Wheel> addWheel(Wheel wheel){
        wheels.add(wheel);
        return wheels;
    }

    public String moveWheels(){
        return "the wheels on the truck go 'round and 'round";
    }

    public String action(){
        return "I am a Truck of name"+this.getName()+" and I am moving";
    }

    
    
    public boolean equals(Object o) {
    	try {
    		Truck aux = (Truck) o;
    		return aux.getName().equals(this.getName());
    		
    	}catch(ClassCastException cce) {
    		//Object o is not a Truck, then false
    		return false;
    	}
    }
}
