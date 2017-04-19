package org.joyofcoding.objectcalisthenics;

import org.joyofcoding.objectcalisthenics.updaters.*;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

    public static void main(String[] args) {
        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(gildedRose.makeItems());
    }

    public List<Item> makeItems() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", new SellIn(10), new Quality(20), new VestUpdater()));
        items.add(new Item("Aged Brie", new SellIn(2), new Quality(0), new BrieUpdater()));
        items.add(new Item("Elixir of the Mongoose", new SellIn(5), new Quality(7), new ElixirUpdater()));
        items.add(new Item("Sulfuras, Hand of Ragnaros", new SellIn(0), new Quality(80), new HandUpdater()));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", new SellIn(15), new Quality(20), new BackstagePassUpdater()));
        items.add(new Item("Conjured Mana Cake", new SellIn(3), new Quality(6), new ManaCakeUpdater()));
        return items;
    }

    public void updateQuality(List<Item> items) {
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            item.getUpdateStrategy().update(item.getSellIn(), item.getQuality());

        }
    }
}

