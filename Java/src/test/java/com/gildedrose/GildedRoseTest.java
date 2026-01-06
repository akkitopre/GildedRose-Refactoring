package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void testMixedItemsUpdate() {
        Item[] items = new Item[] {
            new Item("Normal Item", 10, 20),
            new Item("Aged Brie", 2, 0),
            new Item("Sulfuras, Hand of Ragnaros", 0, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Conjured Mana Cake", 3, 6)
        };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        // Normal Item: sellIn decreases by 1, quality decreases by 1
        assertEquals(9, items[0].sellIn);
        assertEquals(19, items[0].quality);

        // Aged Brie: sellIn decreases by 1, quality increases by 1
        assertEquals(1, items[1].sellIn);
        assertEquals(1, items[1].quality);

        // Sulfuras: unchanged
        assertEquals(0, items[2].sellIn);
        assertEquals(80, items[2].quality);

        // Backstage passes (>10 days): quality increases by 1
        assertEquals(14, items[3].sellIn);
        assertEquals(21, items[3].quality);

        // Conjured: quality decreases by 2
        assertEquals(2, items[4].sellIn);
        assertEquals(4, items[4].quality);
    }

}