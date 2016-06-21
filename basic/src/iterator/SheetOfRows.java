package iterator;

import java.util.ArrayList;


public class SheetOfRows implements Iterable{
	private ArrayList<RowOfCharacters> mList = new ArrayList<>();;
	private Iterator mIterator;
	
	public void addRow(RowOfCharacters rowOfCharacters){
		mList.add(rowOfCharacters);
	}
      
	
	@Override
	public Iterator getIterator() {
		if(mIterator == null){
		return new Iterator() {
			private int current = 0;
			
			@Override
			public boolean isDone() {
				return mList.size() == current? true:false;
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
				return current < mList.size() ? mList.get(current): null; 
			}
		};
		}else{
			return mIterator;
		}
	
	}
	
	@Override
	public String toString() {
		return "I am Sheet of Rows:" +super.toString() + ". I contain numb of rows:"+ mList.size();
	}

}
