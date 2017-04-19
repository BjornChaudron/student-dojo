package org.joyofcoding.objectcalisthenics;

public class Item {
    private String name;
    SellIn sellIn;
    Quality quality;

    public Item(String name, SellIn sellIn, Quality quality) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn.getAmount();
    }

    public void setSellIn(SellIn sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality.getAmount();
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public boolean hasName(String comparative) {
        return getName().equals(comparative);
    }

    public void decreaseSellIn() {
        sellIn.decreaseSellIn();
    }

    public void increaseQuality() {
        quality.increaseQuality();
    }

    public void decreaseQuality() {
        quality.decreaseQuality();
    }

    public void expire() {
        quality.expire();
    }

    public boolean hasQuality() {
        return quality.hasQuality();
    }

    public boolean hasNotMaximumQuality() {
        return quality.hasNotMaximumQuality();
    }

    public boolean hasSellInLessThanElevenDays() {
        return sellIn.hasSellInLessThanElevenDays();
    }

    public boolean hasSellInLessThanSixDays() {
        return sellIn.hasSellInLessThanSixDays();
    }

    public boolean hasExpired() {
        return sellIn.hasExpired();
    }

}
