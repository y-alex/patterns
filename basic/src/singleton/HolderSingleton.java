package singleton;

public class HolderSingleton {
	private String mName = "I am HolderSingleton";
	public String getName(){
		return mName;
	}
	
	private HolderSingleton(){}
	
	//give us lazy initialization
	public static class Holder{
		public static final HolderSingleton HOLDER_INSTANCE = new HolderSingleton();
	}
	
	public static HolderSingleton getInstance(){
		return Holder.HOLDER_INSTANCE;
	}
}
