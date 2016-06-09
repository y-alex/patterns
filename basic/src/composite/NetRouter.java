package composite;

public interface NetRouter extends NetComponent{
	public void connect(NetComponent targetComponent);
	public void disconnect(NetComponent targetComponent);
}
