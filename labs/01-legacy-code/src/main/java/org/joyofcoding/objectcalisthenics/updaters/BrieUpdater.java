package org.joyofcoding.objectcalisthenics.updaters;

import org.joyofcoding.objectcalisthenics.Quality;
import org.joyofcoding.objectcalisthenics.SellIn;

/**
 * Author: Bjorn, created on 17-4-2017.
 */
public class BrieUpdater implements UpdateStrategy {

    @Override
    public void update(SellIn sellIn, Quality quality) {

        quality.increaseQuality();

        if (sellIn.hasExpired()) {
            quality.increaseQuality();
        }

    }

}
