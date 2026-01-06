package com.gildedrose.updater;

import com.gildedrose.Item;

public class AgedBrieUpdater implements ItemUpdater {
    @Override
    public void update(Item item) {
        item.sellIn--;
        increaseQuality(item, item.sellIn < 0 ? 2 : 1);
    }

    private void increaseQuality(Item item, int amount) {
        item.quality = Math.min(50, item.quality + amount);
    }
}
