package memento;
/*
 * From Wikipedia: 
 * The memento pattern is implemented with three objects: the originator, a caretaker and a memento.
 * The originator is some object that has an internal state. The caretaker is going to do something to the originator, 
 * but wants to be able to undo the change.
 * The caretaker first asks the originator for a memento object.
 * Then it does whatever operation (or sequence of operations) it was going to do. To roll back to the state before the operations, 
 * it returns the memento object to the originator. The memento object itself is an opaque object (one which the caretaker cannot, or should not, change)
 */
public class Main {

	public static void main(String[] args) {
		  Originator originator = new Originator();
	        Caretaker caretaker = new Caretaker();

	        originator.setState("state1");
	        System.out.printf("State is %s\n", originator.getState());
	        caretaker.setMemento(originator.saveState());

	        originator.setState("state2");
	        System.out.printf("State is %s\n", originator.getState());

	        originator.restoreState(caretaker.getMemento());
	        System.out.printf("State is %s\n", originator.getState());
	    }

	

}
