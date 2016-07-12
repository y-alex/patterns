package chainOfResponsibility;

public class Rest1Handler implements RequestHandler{
	private boolean isWorking = true;
	
	//this is next handler in the chain
	private RequestHandler mNextHandler;

	@Override
	public void handleRequest(String request){
		if(isWorking){
			System.out.printf("The request %s was successfuly accomplished by Rest1Handler %n",request);
		}else if(mNextHandler!=null){
				mNextHandler.handleRequest(request);
		}else{
			System.out.println("Error, no working request handlers!");
		}
	}
	@Override
	public void setNextChainHandler(RequestHandler nextHandler){
		mNextHandler = nextHandler;
	}
	
	public void setWorkingStatus(boolean status){
		isWorking = status;
	}
}
