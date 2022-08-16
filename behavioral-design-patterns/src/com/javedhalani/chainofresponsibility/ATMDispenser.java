package com.javedhalani.chainofresponsibility;

public class ATMDispenser {

    private  DispenseChain chain;

    public ATMDispenser() {
        // initialize the chain
        this.chain = new Rupees2000Processor();
        DispenseChain chain2 = new Rupees500Processor();
        DispenseChain chain3 = new Rupees100Processor();

        this.chain.setNextChain(chain2);
        chain2.setNextChain(chain3);
    }

    public void dispens(Currency currency) {
        this.chain.dispense(currency);
    }
}
