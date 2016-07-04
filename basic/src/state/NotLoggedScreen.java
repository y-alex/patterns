package state;

public class NotLoggedScreen implements LogScreen{
	private Context mContext;
	public NotLoggedScreen(Context context) {
		mContext = context;
	}

	@Override
	public void logIn() {
		System.out.println("Logging succeed...");
		mContext.setLogScreen(mContext.getAlreadyLoggedScreen());
	}

	@Override
	public void logOut() {
		System.out.println("You cant log out, you didnt log in yet!");
		
	}

	@Override
	public void showInfo() {
		System.out.println("I am not logged screen!");
		
	}

}
