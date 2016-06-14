package abstractfactory.items;

public class DigitalAmplifier implements Amplifier {

	@Override
	public void amplify() {
		System.out.println("Digital amplifiying ...");	
	}
 
}