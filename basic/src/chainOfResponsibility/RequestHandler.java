package chainOfResponsibility;

public interface RequestHandler {
	void handleRequest(String request);
	void setNextChainHandler(RequestHandler nextHandler);
	public void setWorkingStatus(boolean status);
}
