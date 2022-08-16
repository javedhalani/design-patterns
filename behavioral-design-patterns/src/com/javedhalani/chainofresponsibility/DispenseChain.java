package com.javedhalani.chainofresponsibility;

public interface DispenseChain {

    void setNextChain(DispenseChain next);

    void dispense(Currency amount);
}
