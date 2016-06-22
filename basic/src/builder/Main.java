package builder;

/*
 * Pattern builder can be useful mostly in two scenarios:
 * 1) We need create immutable object
 * 2) We have many parameters incoming in the constructor
 * Lets consider 2 scenario
 * We will create some immutable SparePart object with the bunch of digital parameters. 
 */

public class Main {

	public static void main(String[] args) {
		//Only Builder is responsible for creating SparePart
		SparePart sparePart = new SparePart.Builder(11, 12, 13).setBulk(22).setWeight(23).build();

	}

}
