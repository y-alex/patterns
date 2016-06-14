package decorator;

public abstract class TaxiDecorator implements Taxi{
	protected Taxi mTaxi;
	public  TaxiDecorator(Taxi taxi) {
		mTaxi = taxi;
	}
	
	@Override 
	public String getDescription(){
		return mTaxi.getDescription();
	}

	@Override
	public int getBill() {
		return mTaxi.getBill();
	}
	
	@Override
	public void setBill(int bill) {
		mTaxi.setBill(bill);
	}


}
