package threads.semaphore;

public class SharedResource { // A dummy shared resource.
    private int state = 0;
    private final String ID;

    SharedResource(String ID) {
        this.ID = ID;
    }

    public int getState() {
        return state;
    }

    public void setState(int mState) {
        this.state = mState;   // Represents current state.
    }

    public String ID() {
        return this.ID;
    }

}