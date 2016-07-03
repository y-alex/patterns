package templatemethod;

public class MagicShow {
	private void makeSecretPreparation(){
		System.out.println("Preparation....");
	}
	
	protected final void makeMagicShow(){
		makeSecretPreparation();
		makeMagicBox();
	}
	public void makeMagicBox(){
		System.out.println("Magic box is empty...");
	}
}
