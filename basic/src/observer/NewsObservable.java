package observer;

import java.util.Observable;

public class NewsObservable extends Observable{

	public void emitNews(String news){
		setChanged();
		notifyObservers(news);
	}
}
