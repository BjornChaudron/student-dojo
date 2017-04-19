package org.joyofcoding.objectcalisthenics;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

    public static void main(String[] args) {
        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(gildedRose.makeItems());
    }

    public List<Item> makeItems() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", new SellIn(10), new Quality(20)));
        items.add(new Item("Aged Brie", new SellIn(2), new Quality(0)));
        items.add(new Item("Elixir of the Mongoose", new SellIn(5), new Quality(7)));
        items.add(new Item("Sulfuras, Hand of Ragnaros", new SellIn(0), new Quality(80)));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", new SellIn(15), new Quality(20)));
        items.add(new Item("Conjured Mana Cake", new SellIn(3), new Quality(6)));
        return items;
    }

    public void updateQuality(List<Item> items) {
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (!item.hasName("Aged Brie")
                    && !item.hasName("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.hasQuality()) {
                    if (!item.hasName("Sulfuras, Hand of Ragnaros")) {
                        item.decreaseQuality();
                    }
                }
            } else {
                if (item.hasNotMaximumQuality()) {
                    item.increaseQuality();

                    if (item.hasName("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.hasSellInLessThanElevenDays()) {
                            if (item.hasNotMaximumQuality()) {
                                item.increaseQuality();
                            }
                        }

                        if (item.hasSellInLessThanSixDays()) {
                            if (item.hasNotMaximumQuality()) {
                                item.increaseQuality();
                            }
                        }
                    }
                }
            }

            if (!item.hasName("Sulfuras, Hand of Ragnaros")) {
                item.decreaseSellIn();
            }

            if (item.hasExpired()) {
                if (!item.hasName("Aged Brie")) {
                    if (!item.hasName("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.hasQuality()) {
                            if (!item.hasName("Sulfuras, Hand of Ragnaros")) {
                                item.decreaseQuality();
                            }
                        }
                    } else {
                        item.expire();
                    }
                } else {
                    if (item.hasNotMaximumQuality()) {
                        item.increaseQuality();
                    }
                }
            }
        }
    }

}
