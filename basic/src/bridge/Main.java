package bridge;
/**
 * This class is the example of the usage Bridge pattern
 * We have an abstraction, abstract class SoftwareDevelopment
 * This class have many subclasses(specific implementations),
 * that have separate "branch" of evolving. F.e: FullProjectDevelopment,
 * TaskProjectDevelopment, BugFixProjectDevelopment e.t.c 
 * 
 * We want also have some implementation of the features of this classes,
 * those who will do and can do this job. F.example: DeveloperTeam or OneDeveloper, no matter.
 * To be sure that this  guys can do this job and again, no matter who they are(if we want add new guy),
 *  we will use them throw abstract class Developer, and all our guys must extend this class.
 *  That's it, divided abstraction from implementation.
 *  NOTE: we will use constructors to set implementation in our abstraction, we can use AbstractFactory e.t.c  
 * @author Alex
 *
 */
public class Main {

	public static void main(String[] args) {
		SoftwareDevelopment developmentFixBug = new BugFixDevelopment(new OneDeveloper());
		developmentFixBug.develop("Fix critical bug");
		
		SoftwareDevelopment developmentProduct = new FullProjectDevelopment(new TeamDeveloper());
		developmentProduct.develop("Develop new product");
	}

}
