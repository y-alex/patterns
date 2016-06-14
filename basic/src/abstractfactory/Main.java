package abstractfactory;

/**
 * This class is the example of the usage Abstract factory pattern
 * We will build the radio Receiver, that has various components, but this components
 * has same interface. We will create digital or analog receiver.
 * NOTE: we can/must create our custom factories as singlentons to use in other parts of program
 * @author Alex
 *
 */
public class Main {

	public static void main(String[] args) {
		//Now if we have to choose a digital receiver - create a digital factory
		//the client has no idea what receiver will be used.
		AbstractFactoryReceiver analogReceiver = new AnalogReceiverFactory();
		analogReceiver.getAntenna().receiveSignal();
		analogReceiver.getAmplifier().amplify();
		
		AbstractFactoryReceiver digitalReceiver = new DigitalReceiverFactory();
		digitalReceiver.getAntenna().receiveSignal();
		digitalReceiver.getAmplifier().amplify();
	}

}
