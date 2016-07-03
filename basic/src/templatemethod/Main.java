package templatemethod;

/*
 * Abstract example of TemplateMethod
 * The goal of pattern is : use inheritance to change some part of algorithm
 */

public class Main {

	public static void main(String[] args) {
		MagicShow magicFirework = new MagicFirework();
		new MagicShow().makeMagicShow();
		new MagicFirework().makeMagicShow();
	}

}
