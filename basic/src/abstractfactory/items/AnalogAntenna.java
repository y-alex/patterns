package abstractfactory.items;

public class AnalogAntenna implements Antenna{

	@Override
	public void receiveSignal() {
		System.out.println("Received signal from analog antenna ...");
		
	}

}

