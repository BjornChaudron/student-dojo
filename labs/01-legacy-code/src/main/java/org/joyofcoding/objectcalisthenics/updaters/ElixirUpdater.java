 package org.joyofcoding.objectcalisthenics.updaters;


 import org.joyofcoding.objectcalisthenics.Quality;
 import org.joyofcoding.objectcalisthenics.SellIn;

 /**
 * Author: Bjorn, created on 17-4-2017.
 */
public class ElixirUpdater implements UpdateStrategy {

    @Override
    public void update(SellIn sellIn, Quality quality) {

        quality.decreaseQuality();

        sellIn.decreaseSellIn();

        if (sellIn.hasExpired() && quality.hasQuality()) {
            quality.decreaseQuality();
        }

    }
}
