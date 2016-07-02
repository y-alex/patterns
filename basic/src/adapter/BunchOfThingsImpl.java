package adapter;

import java.util.LinkedList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class BunchOfThingsImpl<K, V> implements BunchOfThings<K, V>{
	private LinkedList<K> listKey;
	private LinkedList<V> listVal;
	public BunchOfThingsImpl(){
		listKey = new LinkedList<>();
		listVal = new LinkedList<>();
	}
	
	public  int getSize(){
	  return listKey.size();
	}
	public  void putThing(K key,V val){
		listKey.add(key);
		listVal.add(val);
	}
	public  boolean deleteThing(K key){
		int listKeyIndex = listKey.indexOf(key);
		if(listKeyIndex == -1 || !listKey.remove(key)){
			return false;
		}
		listVal.remove(listKeyIndex);
		return true;		
	}
	public  V getThing(K key){
		return listVal.get(listKey.indexOf(key));
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("");
		for(int i = 0; i<listKey.size(); i++){
			stringBuilder.append("Key: ");
			stringBuilder.append(listKey.get(i));
			stringBuilder.append("Value: ");
			stringBuilder.append(listVal.get(i));
			stringBuilder.append("\n");
		}
		return stringBuilder.toString();
	}
	
}
