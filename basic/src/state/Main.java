package state;
	/*
	 * This is example of State pattern
	 * The purpose is changing behavior of the object and the client doesn't
	 * know many information or doesn't know anything about current state
	 * F.e: We have logging screen, this screen has two state: 
	 * 1) User doesn't logged and screen demand in login and password
	 * 2) User has already logged, and screen show current information about user 
	 */
public class Main {
	

	public static void main(String[] args) {
		Context context = new Context();
		
		context.login();
		context.login();
		context.logout();

	}

}
