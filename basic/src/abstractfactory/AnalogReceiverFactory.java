package abstractfactory;

import abstractfactory.items.Amplifier;
import abstractfactory.items.AnalogAmplifier;
import abstractfactory.items.AnalogAntenna;
import abstractfactory.items.Antenna;

public class AnalogReceiverFactory implements AbstractFactoryReceiver{

	@Override
	public Amplifier getAmplifier() {
		return new AnalogAmplifier();
	}

	@Override
	public Antenna getAntenna() {
		return new AnalogAntenna();
	}

}
