package state;

public class Context {
	private LogScreen mLogScreen = new NotLoggedScreen(this) ;
	private LogScreen mNotLoggedScreen = new NotLoggedScreen(this);
	private LogScreen mAlreadyLoggedScreen = new AlreadyLoggedScreen(this);
	public void login(){
		mLogScreen.logIn();
	}
	
	public void logout(){
		mLogScreen.logOut();
	}
	
	public void info(){
		mLogScreen.showInfo();
	}
	
	void setLogScreen(LogScreen screen){
		mLogScreen = screen;
	}
	
	LogScreen getNotLoggedScreen(){
		return mNotLoggedScreen;
	}
	
	LogScreen getAlreadyLoggedScreen(){
		return mAlreadyLoggedScreen;
	}
}
