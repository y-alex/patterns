package command;

import java.util.ArrayList;

public class Radio {
	private ArrayList<Command> mListCommands = new ArrayList<>();
	
	public Radio(){		
	}
	
	public void addCommand(Command command){
		mListCommands.add(command);
	}
	public void deleteCommand(Command command){
		mListCommands.remove(command);
	}
	
	public void executeAllCommands(){
		System.out.println("Starting executing commands.....");
		for(Command command:mListCommands){
			command.justTalk();		
		}
		
		System.out.println("The end of commands!");
	}
}
