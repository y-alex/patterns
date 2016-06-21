package visitor;

public class DepartmentA implements Department{

	@Override
	public void acceptInspection(Inspection inspection) {
		inspection.inspectDepartmentA(this);
		
	}
}
