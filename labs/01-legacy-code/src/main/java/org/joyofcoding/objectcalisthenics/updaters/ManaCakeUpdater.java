package org.joyofcoding.objectcalisthenics.updaters;

import org.joyofcoding.objectcalisthenics.Quality;
import org.joyofcoding.objectcalisthenics.SellIn;

/**
 * Author: Bjorn, created on 17-4-2017.
 */
public class ManaCakeUpdater implements UpdateStrategy {

    @Override
    public void update(SellIn sellIn, Quality quality) {
        quality.increaseQuality();

        sellIn.decreaseSellIn();

        if (sellIn.hasExpired() && quality.hasQuality()) {
            quality.decreaseQuality();
        }

    }
}
