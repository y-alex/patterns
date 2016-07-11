package flyweight;
/*
 * The intention of the pattern is decreasing memory consumption for a 
 * very big amount of the particular identical objects.
 * Main idea - to separate intrinsic and extrinsic state of the object.
 * Then we must to use factory with pool of the already created objects
 * if object not exist - create new, otherwise return from the pool. 
 * 
 * In this example we need to create simple bubble animation.
 * We will have large amount of bubbles(circles) with different radius sizes -
 * this is intrinsic state, we will draw this bubbles with custom position extrinsic state(context) and 
 * custom animators. 
 * 
 */
public class Main {

	public static void main(String[] args) {
		BubbleFactory.createBubble(1).draw(1, 1);//identical hash with radius 1
		BubbleFactory.createBubble(2).draw(3, 3);
		BubbleFactory.createBubble(1).draw(4, 4);// identical hash with radius 1
	}
	
	//result
	//Draw the bubble radius:1;flyweight.Bubble@2a139a55
	//Draw the bubble radius:2;flyweight.Bubble@15db9742
	//Draw the bubble radius:1;flyweight.Bubble@2a139a55

}
