package bridge;

public class TeamDeveloper implements Developer{

	@Override
	public void startDevelop(String task) {
		System.out.println("We are team of developers, starting to do task:"+task);
		
	}

}

