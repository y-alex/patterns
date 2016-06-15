package bridge;

public class FullProjectDevelopment extends SoftwareDevelopment {

	public FullProjectDevelopment(Developer developer) {
		super(developer);
	}

	@Override
	public void develop(String task) {
		mDeveloper.startDevelop(task);		
	}

}
