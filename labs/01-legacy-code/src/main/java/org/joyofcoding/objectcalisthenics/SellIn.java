package org.joyofcoding.objectcalisthenics;

/**
 * Author: Bjorn, created on 19-4-2017.
 */
public class SellIn {
    private int amount;

    public SellIn(int amount) {
        this.amount = amount;
    }

    public void decreaseSellIn() {
        setAmount(getAmount() - 1);
    }

    public boolean hasExpired() {
        return getAmount() < 0;
    }

    public boolean isLessThanElevenDays() {
        return getAmount() < 11;
    }

    public boolean isLessThanSixDays() {
        return getAmount() < 6;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
