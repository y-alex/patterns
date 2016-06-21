package visitor;

public class QualityInspection implements Inspection{

	@Override
	public void inspectDepartmentA(Department A) {
		System.out.println("Quality inspection inspects Department A...");
		
	}

	@Override
	public void inspectDepartmentB(Department B) {
		System.out.println("Quality inspection inspects Department B...");
		
	}

}
