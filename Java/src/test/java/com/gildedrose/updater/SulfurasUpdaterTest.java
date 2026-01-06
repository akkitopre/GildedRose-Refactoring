package com.gildedrose.updater;

import org.junit.jupiter.api.Test;
import com.gildedrose.Item;
import static org.junit.jupiter.api.Assertions.*;

public class SulfurasUpdaterTest {

    @Test
    void sulfurasNeverChanges() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        new SulfurasUpdater().update(item);
        assertEquals(0, item.sellIn);
        assertEquals(80, item.quality);
    }
}
