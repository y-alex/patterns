package abstractfactory;

import abstractfactory.items.Amplifier;
import abstractfactory.items.Antenna;
import abstractfactory.items.DigitalAmplifier;
import abstractfactory.items.DigitalAntenna;



public class DigitalReceiverFactory implements AbstractFactoryReceiver{

	@Override
	public Amplifier getAmplifier() {
		return new DigitalAmplifier();
	}

	@Override
	public Antenna getAntenna() {
		return new DigitalAntenna();
	}

}

