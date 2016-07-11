package flyweight;

import java.util.HashMap;
import java.util.Map;

public class BubbleFactory {
	private static Map<Integer, Bubble> mBubbleMap = new HashMap<>();
	
	public static synchronized Bubble createBubble(int radius){
		if(mBubbleMap.get(radius) == null){
			mBubbleMap.put(radius, new Bubble(radius));
		}
		return mBubbleMap.get(radius);
	}
}
