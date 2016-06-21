package iterator;

/*
 * The idea of pattern is: create ONE mechanism iterating throw any object. 
 * No matter this is one object or some collection.
 * We will create interface Iterator with methods that we need to iterate. Each object will have possibility 
 * give us his iterator and we have encapsulated the structure of object.  
 */
public class Main {

	public static void main(String[] args) {
	
		RowOfCharacters rowOfCharacters1 = new RowOfCharacters();
		RowOfCharacters rowOfCharacters2 = new RowOfCharacters();
		
		SheetOfRows sheetOfRows = new SheetOfRows();
		sheetOfRows.addRow(rowOfCharacters1);
		sheetOfRows.addRow(rowOfCharacters2);
		
		startIterate(rowOfCharacters1.getIterator());
		startIterate(sheetOfRows.getIterator());
	}
	
	public static void startIterate(Iterator iterator){
		for(iterator.goToFirst();!iterator.isDone(); iterator.goToNext()){
			System.out.println(iterator.getCurrentItem().toString());
		}
	}

}
