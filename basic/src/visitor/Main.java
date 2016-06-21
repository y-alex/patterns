package visitor;
/*
 * Pattern visitor: 
 * We have two class hierarchies:
 * 1) The hierarchy for the elements, on which the operation executes -"Element accept visitor"(accept(Visitor))  
 * 2) The second hierarchy is our Visitors: interface + implementations what to do.
 * Brief: we have visitors with some logic that can do some operations with Element object
 * In example: The company has a bunch of the departments, all this departments need to control: quality and productivity 
 * Inspections - are our visitors
 */
public class Main {

	public static void main(String[] args) {
		Department departmentA = new DepartmentA();
		Department departmentB = new DepartmentB();
		
		departmentA.acceptInspection(new QualityInspection());
		departmentB.acceptInspection(new ProductivityInspection());

	}

}
