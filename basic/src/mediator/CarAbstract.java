package mediator;

public abstract class CarAbstract {
	protected TaxiMediatorInterface mTaxiMediator;
	protected String mName;
	
	public CarAbstract(TaxiMediatorInterface taxiMediator, String name) {
		super();
		mTaxiMediator =taxiMediator;
		mName = name;
	}
	
	public abstract void send(String message);
	public abstract void receive(String message, CarAbstract from);
	
	public String getName(){
		return mName;
	}
	
}

