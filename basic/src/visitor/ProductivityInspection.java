package visitor;

public class ProductivityInspection implements Inspection{

	@Override
	public void inspectDepartmentA(Department A) {
		System.out.println("Productivity inspection inspects Department A...");
		
	}

	@Override
	public void inspectDepartmentB(Department B) {
		System.out.println("Productivity inspection inspects Department B...");
		
	}

}
