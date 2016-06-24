package observer;

import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer{
	private String mName;
	
	public Subscriber(String name) {
		mName = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.printf("I am subscriber %s, I received news: %s %n", mName, (String)arg);
		
	}

}
