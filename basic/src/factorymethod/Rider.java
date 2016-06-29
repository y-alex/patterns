package factorymethod;

public abstract class Rider {
	
	public void startRiding(){
		Animal animal = createAnimal();
		animal.saySomething();
	}
	
	protected abstract Animal createAnimal();
}
