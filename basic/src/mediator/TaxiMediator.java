package mediator;

import java.util.ArrayList;
import java.util.List;

public class TaxiMediator implements TaxiMediatorInterface{
	
	private List<CarAbstract> cars = new ArrayList<CarAbstract>(); 

	@Override
	public void sendMessage(String message, CarAbstract car) {
		for(CarAbstract c : cars){
			if( c != car){
				c.receive(message, car);
			}
		}
		
	}

	@Override
	public void addCar(CarAbstract car) {
		cars.add(car);
		
	}

}
