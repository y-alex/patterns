package decorator;

/**
 * This class is the very simple example of the  Decorator  pattern
 * We have interface Taxi, and class SimpleTaxi that implements Taxi interface
 * But we want add new features to the SimpleTaxi object and remove new features in runtime,
 *  and don't want create new class 
 *  Thats why we use Abstract class - Decorator, and will delegate all needed operations to 
 *  our simple taxi;
 *  Lets create SuperTaxi from Simple;
 * @author Alex
 *
 */

public class Main {
	public static void main(String ... args){
		Taxi taxi = new SimpleTaxi();
		taxi.setBill(11);		
		System.out.println(taxi.getDescription() + taxi.getBill());
		
		//now lets make super taxi from simple taxi		
		Taxi superTaxi = new SuperTaxi(taxi);
		System.out.println(superTaxi.getDescription() + superTaxi.getBill());
		
	}
}
