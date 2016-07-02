package adapter;

import java.util.Map;

public class MapAdaptedToBunchOfThings<K, V> implements BunchOfThings<K, V>{
	private Map<K,V> mMapToAdaptee;
	
	public MapAdaptedToBunchOfThings(Map map){
		mMapToAdaptee = map;
	}

	@Override
	public int getSize() {
		return mMapToAdaptee.size();
	}

	@Override
	public void putThing(K key, V val) {
		mMapToAdaptee.put(key, val);
	}

	@Override
	public boolean deleteThing(K key) {
		return mMapToAdaptee.remove(key)!=null;
	}

	@Override
	public V getThing(K key) {
		return mMapToAdaptee.get(key);
	}
	
	@Override
	public String toString(){
		return mMapToAdaptee.toString();
	}

}
