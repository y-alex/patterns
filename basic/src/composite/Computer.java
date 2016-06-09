package composite;

public class Computer implements NetComponent{
	
	private int mDistance;
	
	public Computer(){}
	public Computer(int distance){
		mDistance = distance;
	}

	@Override
	public int getLength() {
		return mDistance;
	}

}
