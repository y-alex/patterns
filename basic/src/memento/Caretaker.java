package memento;

public class Caretaker {
    private Memento mMemento;

    public Memento getMemento() {
        return mMemento;
    }

    public void setMemento(Memento memento) {
        this.mMemento = memento;
    }
}
