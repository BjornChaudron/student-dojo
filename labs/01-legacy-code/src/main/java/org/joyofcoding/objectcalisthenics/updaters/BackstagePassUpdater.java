package org.joyofcoding.objectcalisthenics.updaters;


import org.joyofcoding.objectcalisthenics.Quality;
import org.joyofcoding.objectcalisthenics.SellIn;

/**
 * Author: Bjorn, created on 17-4-2017.
 */
public class BackstagePassUpdater implements UpdateStrategy {

    @Override
    public void update(SellIn sellIn, Quality quality) {

        quality.increaseQuality();

        if (sellIn.isLessThanElevenDays()) {
            quality.increaseQuality();
        }

        if (sellIn.isLessThanSixDays()) {
            quality.increaseQuality();
        }

        sellIn.decreaseSellIn();

        if (sellIn.hasExpired()) {
            quality.expire();
        }
    }
}
