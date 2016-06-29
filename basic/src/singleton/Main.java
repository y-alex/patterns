package singleton;


/*
 * Simple example of lazy and not lazy singletons
 */
public class Main {
	public static void main(String ... args){
		System.out.println(isHashOfObjectsEqual(EnumSingleton.INSTANCE, EnumSingleton.INSTANCE));
		System.out.println(isHashOfObjectsEqual(FinalFieldSingleton.INSTANCE, FinalFieldSingleton.INSTANCE));
		System.out.println(isHashOfObjectsEqual(HolderSingleton.getInstance(), HolderSingleton.getInstance()));
		System.out.println(isHashOfObjectsEqual(DoubleCheckLockingSingleton.getInstance(), DoubleCheckLockingSingleton.getInstance()));
	}
	
	public static boolean isHashOfObjectsEqual(Object singleton1, Object singleton2){
		return singleton1.toString().equals(singleton2.toString());
	}
}
