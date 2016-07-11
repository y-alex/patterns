package memento;

public class Originator {
    private String mState;

    public void setState(String state) {
        mState = state;
    }

    public String getState() {
        return mState;
    }

    public Memento saveState() {
        return new Memento(mState);
    }

    public void restoreState(Memento memento) {
        mState = memento.getState();
    }
}
