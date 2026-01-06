package com.gildedrose;

import com.gildedrose.factory.ItemUpdaterFactory;
import com.gildedrose.updater.ItemUpdater;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        
		for (Item item : items) {
			ItemUpdater updater = ItemUpdaterFactory.getUpdater(item);
			updater.update(item);
		}
    }
}
