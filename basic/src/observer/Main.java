package observer;

import java.util.Observable;

/*
 * Example of the implementation Observer pattern with using java api classes.
 * There are some disadvantage using class Observable like: 
 * 1) this is class.
 * 2) we must extend this class because methods setChanged(), clearChanged are protected and 
 * we can't simply instantiate and use object of this class.  
 * 
 */

public class Main {

	public static void main(String[] args) {
		NewsObservable observable = new NewsObservable();
		//we added new observers, they will receive data when news appears in NewsObservable
		observable.addObserver(new Subscriber("John"));
		observable.addObserver(new Subscriber("Eric"));
		//sysout:
		//I am subscriber Eric, I received news: GOOD NEWS!The weather is fine
		//I am subscriber John, I received news: GOOD NEWS!The weather is fine
		observable.emitNews("GOOD NEWS!The weather is fine");
		
	}

}
