package org.joyofcoding.objectcalisthenics;

/**
 * Author: Bjorn, created on 19-4-2017.
 */
public class Quality {
    public static final int MINIMUM_QUALITY = 0;
    public static final int MAX_QUALITY = 50;

    private int amount;

    public Quality(int amount) {
        this.amount = amount;
    }

    public void increaseQuality() {
        if (hasNotMaximumQuality()) {
            setAmount(getAmount() + 1 );
        }
    }

    public boolean hasNotMaximumQuality() {
        return getAmount() < MAX_QUALITY;
    }

    public void decreaseQuality() {
        if (hasQuality()) {
            setAmount(getAmount() - 1);
        }
    }

    public boolean hasQuality() {
        return getAmount() > MINIMUM_QUALITY;
    }

    public void expire() {
        setAmount(0);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
