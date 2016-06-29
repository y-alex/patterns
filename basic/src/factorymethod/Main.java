package factorymethod;

/*
 * This is dummy example of the using Factory method pattern. 
 * The main idea is to use late binding for encapsulating creating special type of object.
 * Need to create abstract/notabstract method without/with_default implementation, that return
 * new object 
 * Delegation of creating object to the other class(child) give us dependency inversion
 * between two classes
 */
public class Main {

	public static void main(String[] args) {
		Rider riderCow = new CowRider();
		Rider riderHorse = new HorseRider();
		
		riderCow.startRiding();
		riderHorse.startRiding();
	}

}
