package command;

public class SayHelloGByCommand implements Command{
	private Talker mTalker;
	public SayHelloGByCommand(Talker talker){
		mTalker = talker;
	}
	
	public  void justTalk(){
		mTalker.sayGoodBy();
	}
}
