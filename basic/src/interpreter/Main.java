package interpreter;

import java.text.NumberFormat;

/*
 * This is example of interpreter pattern.
 * Goal - pattern that specifies how to evaluate sentences in a language.
 *  The basic idea is to have a class for each symbol (terminal-the elementary symbols of the language; 
 *  												 or nonterminal - are replaced by groups of terminal symbols according to the production rules)
 *  												 in a specialized computer language. 
 *  The syntax tree of a sentence in the language is an instance of the composite pattern and is used to evaluate (interpret) the sentence for a client
 * 	In our example we will interpret "'number'- hexadecimal" or 'number'- binary"  to "'number'- binary = '1101..'"...
 */
public class Main {
	public InterpreterContext mInterprContext;
	public Main(InterpreterContext context){
		mInterprContext = context;
	}
	public String interpret(String str){
		Expression expression = null;
		if(str.contains("hexadecimal")){
			expression = new DecimalToHexExpr(Integer.parseInt(str.substring(0,str.indexOf(" "))));
		}else if(str.contains("binary")){
			expression= new DecimalToBinaryExpr(Integer.parseInt(str.substring(0,str.indexOf(" "))));
		}else return str;
		return expression.interpret(mInterprContext);
	}
	public static void main(String args[]){
		String str1 = "10 in binary";
		String str2 = "10 in hexadecimal";
		Main ec = new Main(new 	InterpreterContext());
		System.out.println(str1+"= "+ec.interpret(str1));
		System.out.println(str2+"= "+ec.interpret(str2));
	}

}
