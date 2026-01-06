package com.gildedrose.updater;

import org.junit.jupiter.api.Test;
import com.gildedrose.Item;
import static org.junit.jupiter.api.Assertions.*;

public class ConjuredItemUpdaterTest {

    @Test
    void qualityDecreasesByTwoBeforeSellDate() {
        Item item = new Item("Conjured Mana Cake", 5, 20);
        new ConjuredItemUpdater().update(item);
        assertEquals(4, item.sellIn);
        assertEquals(18, item.quality);
    }

    @Test
    void qualityDecreasesByFourAfterSellDate() {
        Item item = new Item("Conjured Mana Cake", 0, 20);
        new ConjuredItemUpdater().update(item);
        assertEquals(-1, item.sellIn);
        assertEquals(16, item.quality);
    }

    @Test
    void qualityNeverNegative() {
        Item item = new Item("Conjured Mana Cake", 5, 1);
        new ConjuredItemUpdater().update(item);
        assertEquals(4, item.sellIn);
        assertEquals(0, item.quality);
    }
}

