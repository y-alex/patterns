package iterator;

import java.util.ArrayList;

public class RowOfCharacters implements Iterable{
	private Character[] mArrayCharacters ;
	private Iterator mIterator;
	
	public RowOfCharacters() {
		//some characters in the Row
		mArrayCharacters = new Character[]{new Character('a'), new Character('b'), new Character('c')};
	}

	@Override
	public Iterator getIterator() {
		if(mIterator == null){
		return new Iterator() {
			private int current = 0;
			
			@Override
			public boolean isDone() {
				return current == mArrayCharacters.length? true : false;
			}			
			@Override
			public void goToNext() {
				current++;				
			}			
			@Override
			public void goToFirst() {
				current = 0;				
			}			
			@Override
			public Object getCurrentItem() {
				return current < mArrayCharacters.length ? mArrayCharacters[current]: null; 
			}
		};
		}else{
			return mIterator;
		}
	
	}
	
	@Override
	public String toString() {
		return "I am a Row of Characters:" +super.toString() + ". I contain numb of characters:"+ mArrayCharacters.length;
	}
}
