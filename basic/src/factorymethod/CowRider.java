package factorymethod;

public class CowRider extends Rider{

	@Override
	protected Animal createAnimal() {
		return new Cow();
	}

}
