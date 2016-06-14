package decorator;

public class SimpleTaxi implements Taxi{
	private int mBill;
	@Override 
	public String getDescription(){
		return "Simple taxi!";
	}

	@Override
	public int getBill() {
		return mBill;
	}
	
	@Override
	public void setBill(int bill) {
		mBill = bill;
	}

}
