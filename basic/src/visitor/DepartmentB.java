package visitor;

public class DepartmentB implements Department{

	@Override
	public void acceptInspection(Inspection inspection) {
		inspection.inspectDepartmentB(this);
		
	}

}
