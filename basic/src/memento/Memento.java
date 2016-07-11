package memento;

public class Memento {
	//This is state that Memento intended to save
	 private final String mState;
	
	public Memento(String state){
		mState = state;
	}
	
	public String getState(){
		return mState;
	}
}
