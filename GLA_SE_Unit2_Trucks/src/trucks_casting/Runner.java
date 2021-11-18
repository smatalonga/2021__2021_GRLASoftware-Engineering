package trucks_casting;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args){
    	//Abstract clases can not be instantiated.
    	//Vehicle v = new Vehicle();
    	
    	Engine t1_engine = new Engine();
    	
    	Truck t1 = new Truck(t1_engine);
    	
    	System.out.println(t1.StartEngine()); //Note that StartEngine is defined in Vehicle
    	System.out.println(t1.action()); //Note that action is defined in Truck
    	
    	//Up CAsting
    	Vehicle v = t1;
    	
    	System.out.println(v.StartEngine());
    	
    	
    	//Downcasting
    	Truck t2 = (Truck) v;
    	System.out.println(t2.StartEngine()); //Note that StartEngine is defined in Vehicle
    	System.out.println(t2.action()); //Note that action is defined in Truck
    	
    	
    	/////////////////
    	
    	System.out.println("Example 2 \n");
    	Car c1 = new Car();
    	
    	System.out.println(c1.StartEngine()); //Note that StartEngine is defined in Vehicle
    	System.out.println(c1.go()); //Note that action is defined in Truck
    	
    	//Up Casting
    	Vehicle v2 = c1;
    	System.out.println(c1.StartEngine()); //Note that StartEngine is defined in Vehicle
    	
    	
    	//Downcasting
    	Car c2 = (Car) v2;
    	System.out.println(c2.StartEngine()); //Note that StartEngine is defined in Vehicle
    	System.out.println(c2.go()); //Note that action is defined in Truck
    	
    	//Watch it explote
    	
    	//Car c3 = (Car) v;
    	
    	//c3.StartEngine();
    	
    	//type checking is bad practice
    	/*if (v instanceof Car) {
    		Car c3 = (Car) v;
        	
        	c3.StartEngine();
    		
    	}else {
    		System.out.println("Not a car");
    	}*/
    	
    	//////////////////
    	
    	// Side not Equals
    	
    	Truck testsubject1 = new Truck(new Engine());
    	Truck testsubject2 = new Truck(new Engine());
    	
    	/*if (testsubject1.equals(testsubject2)) {
    		System.out.println("These two variables of type truck, are the same object");
    		
    	}
    	else {
    		System.out.println("These two variables of type truck, are different objects");
    		System.out.println("mem for testsubject1 -->"+testsubject1.toString());
    		System.out.println("mem for testsubject2 -->"+testsubject2.toString());
    		
    	}*/
    	
    	testsubject1.setName("T1");
    	testsubject2.setName("T2");
    	
    	if (testsubject1.equals(testsubject2)) {
    		System.out.println("These two variables of type truck, are the same object");
    		
    	}
    	else {
    		System.out.println("These two variables of type truck, are different objects");
    		System.out.println("mem for testsubject1 -->"+testsubject1.toString()+"/"+testsubject1.getName());
    		System.out.println("mem for testsubject2 -->"+testsubject2.toString()+"/"+testsubject2.getName());
    		
    	}
    		
    	testsubject2.setName("T1");
    	if (testsubject1.equals(testsubject2)) {
    		System.out.println("These two variables of type truck, are the same object");
    		
    	}
    	else {
    		System.out.println("These two variables of type truck, are different objects");
    		System.out.println("mem for testsubject1 -->"+testsubject1.toString()+"/"+testsubject1.getName());
    		System.out.println("mem for testsubject2 -->"+testsubject2.toString()+"/"+testsubject2.getName());
    		
    	}
    	
    	
    	/////////////
    	
    	ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
    	Truck first = new Truck(new Engine());
    	first.setName("T1");
    	Truck second = new Truck(new Engine());
    	second.setName("T2");
    	Truck third = new Truck(new Engine());
    	third.setName("T3");
    	Car firstCar = new Car();
    	Car secondCar = new Car();
    	Car thirdCar = new Car();
    	
    	vehicleList.add(first);
    	vehicleList.add(second);
    	vehicleList.add(third);
    	vehicleList.add(firstCar);
    	vehicleList.add(secondCar);
    	vehicleList.add(thirdCar);
    	
    	for (Vehicle vIndex : vehicleList) {
    		System.out.println(vIndex.StartEngine());
    		System.out.print("\t");
    		System.out.println(vIndex.action());
    	}
    	
    	
    	
    	
    }
}
