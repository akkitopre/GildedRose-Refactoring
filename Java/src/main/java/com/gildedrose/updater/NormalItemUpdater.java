package com.gildedrose.updater;

import com.gildedrose.Item;

public class NormalItemUpdater implements ItemUpdater {
    @Override
    public void update(Item item) {
        item.sellIn--;
        decreaseQuality(item, item.sellIn < 0 ? 2 : 1);
    }

    private void decreaseQuality(Item item, int amount) {
        item.quality = Math.max(0, item.quality - amount);
    }
}
