package org.joyofcoding.objectcalisthenics.updaters;


import org.joyofcoding.objectcalisthenics.Quality;
import org.joyofcoding.objectcalisthenics.SellIn;

/**
 * Author: Bjorn, created on 17-4-2017.
 */
public class BackstagePassUpdater implements UpdateStrategy {

    @Override
    public void update(SellIn sellIn, Quality quality) {

        if (sellIn.hasSellInLessThanElevenDays()) {
            quality.increaseQuality();
        }

        if (sellIn.hasSellInLessThanSixDays()) {
            quality.increaseQuality();
        }

        sellIn.decreaseSellIn();

    }
}
