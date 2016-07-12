package chainOfResponsibility;

/*
 * The idea of the Chain Of Responsibility is that it avoids coupling the sender of the request to the receiver,
 *  giving more than one object the opportunity to handle the request. 
 *  
 *  In this example client can request to the rest api by uri, if result is bad we start using alternative api 
 */

public class Main {

	public static void main(String[] args) {
		//Create the chain of responsibility
		RequestHandler requestHandler1 = new Rest1Handler();
		
		requestHandler1.setNextChainHandler(new Rest2Handler());

		requestHandler1.handleRequest("!**Secret request**!");
		requestHandler1.setWorkingStatus(false);
		
		requestHandler1.handleRequest("!**Secret request**!");
		
	}

}
