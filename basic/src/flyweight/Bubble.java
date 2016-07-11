package flyweight;

public class Bubble {
	private int mRadius;
	public Bubble(int radius){
		mRadius = radius;
	}
	
	public void draw(int xCoord, int yCoord){
		System.out.println("Draw the bubble radius:"+ mRadius +";" + this.toString());
	}
}
