package org.example.hwOOP02;

public abstract class Buyer implements BuyerBehaviour {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    public abstract String getName();
}