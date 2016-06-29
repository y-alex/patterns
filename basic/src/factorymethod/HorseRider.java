package factorymethod;

public class HorseRider extends Rider{

	@Override
	protected Animal createAnimal() {
		return new Horse();
	}

}
