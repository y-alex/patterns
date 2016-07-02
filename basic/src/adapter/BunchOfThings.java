package adapter;

public interface BunchOfThings <K,V>{
	public abstract int getSize();
	public abstract void putThing(K key,V val);
	public abstract boolean deleteThing(K key);
	public abstract V getThing(K key);
}
