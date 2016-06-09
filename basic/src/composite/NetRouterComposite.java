package composite;

import java.util.ArrayList;
import java.util.List;

public class NetRouterComposite implements NetRouter{
	
	private List<NetComponent> components = new ArrayList<NetComponent>();
	
	@Override
	public void connect(NetComponent targetComponent) {
		components.add(targetComponent);		
	}

	@Override
	public void disconnect(NetComponent targetComponent) {		
		components.remove(targetComponent);
	}

	@Override
	public int getLength() {
		int totalLength = 0;
		for (NetComponent netComponent : components) {
			totalLength+= netComponent.getLength();
		}
		return totalLength;
	}

}
