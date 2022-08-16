package com.javedhalani.state;

public class TVContext implements State {

    private State state;

    public TVContext() {
    }

    public TVContext(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state=state;
    }

    @Override
    public void doAction() {
        this.state.doAction();
    }
}
