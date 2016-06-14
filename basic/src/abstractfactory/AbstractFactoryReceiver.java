package abstractfactory;

import abstractfactory.items.Amplifier;
import abstractfactory.items.Antenna;

public interface AbstractFactoryReceiver {
	public abstract Amplifier getAmplifier();
	public abstract Antenna getAntenna();
}
