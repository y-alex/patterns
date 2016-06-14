package decorator;

public class SuperTaxi extends TaxiDecorator{

	public SuperTaxi(Taxi taxi) {
		super(taxi);
	}

	@Override 
	public String getDescription(){
		return super.getDescription() + ", Super Taxi!";
	}

	@Override
	public int getBill() {
		return super.getBill() * 10;
	}
	
	@Override
	public void setBill(int bill) {
		mTaxi.setBill(bill);
	}
}
