package facade;

/*
 * This is example of the Facade pattern
 * The intent is to create unified interface that simplify access 
 * to other methods of subsystem
 */
public class Main {

	public static void main(String[] args) {
		RemoteData remoteData = new RemoteData();		
		DataManagerFacade dataManagerFacade = new DataManagerFacade(new LocalData(), remoteData);
		
		dataManagerFacade.saveData("New X data");
		dataManagerFacade.loadData();
		
		remoteData.isAvailable = false;
		dataManagerFacade.loadData();
	}

}
