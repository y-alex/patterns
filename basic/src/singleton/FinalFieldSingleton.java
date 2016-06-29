package singleton;

public class FinalFieldSingleton {
	public static final FinalFieldSingleton INSTANCE = new FinalFieldSingleton();
	private FinalFieldSingleton(){}
	private String mName = "I am FinalFieldSingleton";
	public String getName(){
		return mName;
	}
}
