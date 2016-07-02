package adapter;

import java.util.HashMap;
import java.util.Map;

/*
 * This is example of the Adapter pattern
 * Idea of the pattern is simple - add possibility to use implementation of 3d library interface 
 * as defined interface.
 * F.e:
 * We have custom class BunchOfThings - this is our custom collection that we use
 * Now we decided to use java Map instead of BunchOfThings
 *    
 */
public class Main {
	public static void dummyTestTheBunchOfThings(BunchOfThings bunch){
		Map<String, String> map = new HashMap<>();
		map.put("key1", "val1");
		map.put("key2", "val2");
		map.put("key3", "val3");
		
		for(Map.Entry<String, String> entry: map.entrySet()){
			bunch.putThing(entry.getKey(), entry.getValue());
		}
		
		System.out.println(bunch);
	}

	public static void main(String[] args) {
		dummyTestTheBunchOfThings(new BunchOfThingsImpl<>());
		dummyTestTheBunchOfThings(new MapAdaptedToBunchOfThings<>(new HashMap<>()));
	}
}
