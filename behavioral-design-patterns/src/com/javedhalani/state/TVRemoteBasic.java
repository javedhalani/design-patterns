package com.javedhalani.state;

public class TVRemoteBasic {

    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void doAction() {
        if (state.equalsIgnoreCase("on")) {
            System.out.println("TV turned ON");
        } else {
            System.out.println("TV turned OFF");
        }
    }

    public static void main(String[] args) {
        TVRemoteBasic remote = new TVRemoteBasic();

        remote.setState("ON");
        remote.doAction();

        remote.setState("OFF");
        remote.doAction();

    }
}
