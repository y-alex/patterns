package bridge;

public class BugFixDevelopment extends SoftwareDevelopment {

	public BugFixDevelopment(Developer developer) {
		super(developer);
	}
	

	@Override
	public void develop(String task) {
		mDeveloper.startDevelop(task);		
	}

}

