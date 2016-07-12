package prototype;

/*
 *  This pattern provides a mechanism to copy(clone) the original object to a new object
 *  and then modify it according to our needs. 
 *  Depends on the requirements we must decide which copy type to use - shallow or deep.
 */
public class Main {

	  private Stone mStone; 

	    public Main(Stone stone) {
	    	mStone = stone;
	    }

	    public Stone getStone() throws CloneNotSupportedException {
	        return (Stone)mStone.clone();
	    }

	    public static void main(String args[]) throws CloneNotSupportedException {
	        Stone someStone = null;
	        BigStone bigStone = new BigStone();
	        Main main = new Main(bigStone);
	        for (int i = 0; i < 20; i++){
	            someStone = main.getStone();
	        	System.out.println(someStone);
	        }
	    }

}
