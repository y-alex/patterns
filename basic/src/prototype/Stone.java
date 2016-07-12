package prototype;

public class Stone  implements Cloneable{
	 protected int weight;

	    @Override
	    public Stone clone() throws CloneNotSupportedException {
	    	Stone copy = (Stone) super.clone();
	       
	        //In an actual implementation of this pattern you might now change references to
	        //the expensive to produce parts from the copies that are held inside the prototype.

	        return copy;
	    }
	}
