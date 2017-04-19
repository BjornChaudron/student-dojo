package org.joyofcoding.objectcalisthenics.updaters;


import org.joyofcoding.objectcalisthenics.Quality;
import org.joyofcoding.objectcalisthenics.SellIn;

/**
 * Author: Bjorn, created on 17-4-2017.
 */
public interface UpdateStrategy {
    void update(SellIn sellIn, Quality quality);
}
