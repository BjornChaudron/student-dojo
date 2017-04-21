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

    public UpdateStrategy getUpdateStrategy() {
        return updateStrategy;
    }

    public void update() {
        updateStrategy.update(sellIn, quality);
    }


}
