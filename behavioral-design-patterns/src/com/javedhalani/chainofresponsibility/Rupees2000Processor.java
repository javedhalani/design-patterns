package com.javedhalani.chainofresponsibility;

public class Rupees2000Processor implements DispenseChain {

    static final int VALUE = 2000;

    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain next) {
        this.dispenseChain = next;
    }

    @Override
    public void dispense(Currency amount) {
        if (amount.getAmount() >= VALUE) {
            int num = amount.getAmount() / VALUE;
            int remainder = amount.getAmount() % VALUE;
            System.out.println("Dispensing " + num + " Rs." + VALUE + " notes");
            if (remainder != 0) this.dispenseChain.dispense(new Currency(remainder));
        } else {
            this.dispenseChain.dispense(amount);
        }

    }
}
