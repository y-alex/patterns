package mediator;

public interface TaxiMediatorInterface {
	
	public void sendMessage(String message, CarAbstract car);
	void addCar(CarAbstract car);
}
