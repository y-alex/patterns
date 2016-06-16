package command;
/**
 * This class is the example of the usage Command pattern
 * Main goal: separate the connection between that object that WANT to do  some operation,
 * and the object that know HOW to do this work
 * Interface Command - have method justTalk(); what do - this is deal of the implemented class.
 * Class that implement Command - operates with some object, and we must give this object to 
 * our implementation of Command class.
 * @author Alex
 *
 */
public class Main {

	public static void main(String[] args) {
		Talker talker = new Talker();
		
		Command sayHello = new SayHelloCommand(talker);				
		Command sayGoodBy = new SayHelloGByCommand(talker);
		
		//Now we can create the plan of Radio BroadCast)		
		Radio radio = new Radio();
		radio.addCommand(sayHello);
		//lets say hello again
		radio.addCommand(sayHello);
		//the end of broadcast - say goodby
		radio.addCommand(sayGoodBy);
		
		//Our broadcast is ready, lets start
		radio.executeAllCommands();

	}

}
