package abstractfactory.items;

public class DigitalAntenna implements Antenna{

	@Override
	public void receiveSignal() {
		System.out.println("Received signal from gigital antenna ...");
		
	}

}
