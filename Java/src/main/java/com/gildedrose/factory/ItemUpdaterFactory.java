package com.gildedrose.factory;

import com.gildedrose.Item;
import com.gildedrose.updater.*;

public class ItemUpdaterFactory {
    public static ItemUpdater getUpdater(Item item) {
        if (item.name.equals("Aged Brie")) return new AgedBrieUpdater();
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) return new SulfurasUpdater();
        if (item.name.startsWith("Backstage passes")) return new BackstagePassUpdater();
        if (item.name.startsWith("Conjured")) return new ConjuredItemUpdater();
        return new NormalItemUpdater();
    }
}
