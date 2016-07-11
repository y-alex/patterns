package interpreter;

public class DecimalToBinaryExpr implements Expression{
	private int mValue;
	public DecimalToBinaryExpr(int value){
		mValue = value;
	}
	@Override
	public String interpret(InterpreterContext context) {
		return context.getBinaryFormat(mValue);
	}
}
