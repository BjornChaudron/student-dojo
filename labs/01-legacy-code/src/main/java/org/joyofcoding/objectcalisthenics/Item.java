package org.joyofcoding.objectcalisthenics;

import org.joyofcoding.objectcalisthenics.updaters.UpdateStrategy;

public class Item {
    private String name;
    private SellIn sellIn;
    private Quality quality;
    private UpdateStrategy updateStrategy;

    public Item(String name, SellIn sellIn, Quality quality, UpdateStrategy updateStrategy) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
        this.updateStrategy = updateStrategy;
    }

    public String getName() {
        return name;
    }
    public SellIn getSellIn() {
        return sellIn;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public UpdateStrategy getUpdateStrategy() {
        return updateStrategy;
    }


}
