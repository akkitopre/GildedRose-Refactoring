package com.gildedrose.updater;

import org.junit.jupiter.api.Test;
import com.gildedrose.Item;
import static org.junit.jupiter.api.Assertions.*;

public class BackstagePassUpdaterTest {

    @Test
    void qualityIncreasesByOneWhenMoreThan10Days() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        new BackstagePassUpdater().update(item);
        assertEquals(14, item.sellIn);
        assertEquals(21, item.quality);
    }

    @Test
    void qualityIncreasesByTwoWhen10DaysOrLess() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20);
        new BackstagePassUpdater().update(item);
        assertEquals(9, item.sellIn);
        assertEquals(22, item.quality);
    }

    @Test
    void qualityIncreasesByThreeWhen5DaysOrLess() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20);
        new BackstagePassUpdater().update(item);
        assertEquals(4, item.sellIn);
        assertEquals(23, item.quality);
    }

    @Test
    void qualityDropsToZeroAfterConcert() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20);
        new BackstagePassUpdater().update(item);
        assertEquals(-1, item.sellIn);
        assertEquals(0, item.quality);
    }
}

