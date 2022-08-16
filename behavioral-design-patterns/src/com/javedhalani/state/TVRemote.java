package com.javedhalani.state;

public class TVRemote {

    public static void main(String[] args) {
        TVContext context = new TVContext();

        State tvStartState = new TVStartState();
        State tvOffState = new TVOffState();

        context.setState(tvStartState);
        context.doAction();

        context.setState(tvOffState);
        context.doAction();

    }
}
