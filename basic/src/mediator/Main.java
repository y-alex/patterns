package mediator;
/*
 * This is example of Mediator pattern.
 * In this example: when 1 taxi car(colleage) send message throw mediator, mediator send this
 * message to other taxi cars.
 */
public class Main {
	public static void main(String ... args){
		TaxiMediatorInterface taxiMediator = new TaxiMediator();
		
		Car car1 = new Car(taxiMediator, "CarName = 1");
		Car car2 = new Car(taxiMediator, "CarName = 2");
		Car car3 = new Car(taxiMediator, "CarName = 3");
		Car car4 = new Car(taxiMediator, "CarName = 4");
		Car car5 = new Car(taxiMediator, "CarName = 5");
		
		taxiMediator.addCar(car1);		
		taxiMediator.addCar(car2);		
		taxiMediator.addCar(car3);		
		taxiMediator.addCar(car4);		
		taxiMediator.addCar(car5);	
		
		car3.send("I am online");
	}
}

