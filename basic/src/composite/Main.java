package composite;
/**
 * This class is the example of the usage Composite pattern
 * computer - is net component, that has length of cable to the router
 * router - is net component, that has a bunch of connected computers
 * Lets count total length of the network cable
 * @author Alex
 *
 */
public class Main {

	public static void main(String[] args) {
		//Router 1
		NetRouter router1 = new NetRouterComposite();
		router1.connect(new Computer(5));
		router1.connect(new Computer(3));
		router1.connect(new Computer(2));
		
		//Router 2
		NetRouter router2 = new NetRouterComposite(); 
		router2.connect(router1);  // here we added 1st router with his computers
		router2.connect(new Computer(2));
		router2.connect(new Computer(2));
		
		System.out.println("Total length of the network is: " + router2.getLength());

	}

}
