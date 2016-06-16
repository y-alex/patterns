package command;

public class SayHelloCommand implements Command{
	private Talker mTalker;
	public SayHelloCommand(Talker talker){
		mTalker = talker;
	}
	
	public  void justTalk(){
		mTalker.sayHello();
	}
}
