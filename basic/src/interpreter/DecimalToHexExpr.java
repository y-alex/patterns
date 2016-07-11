package interpreter;

public class DecimalToHexExpr implements Expression{
	private int mValue;
	public DecimalToHexExpr(int value){
		mValue = value;
	}
	@Override
	public String interpret(InterpreterContext context) {
		return context.getHexadecimalFormat(mValue);
	}
}
