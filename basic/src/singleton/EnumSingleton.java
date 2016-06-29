package singleton;

public enum EnumSingleton {
	INSTANCE;
	private String mName = "I am enum singleton";
	
	public String getName(){
		return mName;
	}
}
