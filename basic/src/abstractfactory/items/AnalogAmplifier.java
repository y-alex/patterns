package abstractfactory.items;


public class AnalogAmplifier implements Amplifier {

	@Override
	public void amplify() {
		System.out.println("Analog amplifiying ...");	
	}
 
}
