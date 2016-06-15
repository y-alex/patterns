package bridge;

public  class OneDeveloper implements Developer{

	@Override
	public void startDevelop(String task) {
		System.out.println("I am One developer, starting to do task:"+task);
		
	}

}
