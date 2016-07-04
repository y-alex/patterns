package state;

public class AlreadyLoggedScreen implements LogScreen{
	private Context mContext;
	public AlreadyLoggedScreen(Context context) {
		mContext = context;
	}

	@Override
	public void logIn() {
		System.out.println("You are already loggined");
	}

	@Override
	public void logOut() {
		System.out.println("Logg Out succeed...");
		mContext.setLogScreen(mContext.getNotLoggedScreen());
		
	}

	@Override
	public void showInfo() {
		System.out.println("I am already logged screen!");
		
	}

}