package mediator;

public class Car extends CarAbstract{

	public Car(TaxiMediatorInterface taxiMediator, String name) {
		super(taxiMediator, name);
		
	}

	@Override
	public void send(String message) {
		System.out.println(mName+":Send message="+message);
        mTaxiMediator.sendMessage(message, this);
		
	}

	@Override
	public void receive(String message, CarAbstract from) {
		System.out.println(mName+": Received message from "+from.getName()+":"+message);
		
	}

}