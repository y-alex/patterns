package iterator;

public interface Iterator {
	public abstract void goToFirst();
	public abstract void goToNext();
	public abstract boolean isDone();
	public abstract Object getCurrentItem();
}
