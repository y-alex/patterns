package bridge;

public abstract class SoftwareDevelopment {
	protected Developer mDeveloper;
	
	public SoftwareDevelopment(Developer developer){
		mDeveloper = developer;
	}
	
	public abstract void develop(String task);
}
