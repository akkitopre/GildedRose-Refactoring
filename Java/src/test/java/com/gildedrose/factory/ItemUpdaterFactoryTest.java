package com.gildedrose.factory;

import com.gildedrose.Item;
import com.gildedrose.updater.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemUpdaterFactoryTest {
	
	@Test
    void testNormalItemUpdaterCreation() {
        Item item = new Item("Normal Item", 10, 20);
        ItemUpdater updater = ItemUpdaterFactory.getUpdater(item);
        assertTrue(updater instanceof NormalItemUpdater);
    }

    @Test
    void testAgedBrieUpdaterCreation() {
        Item item = new Item("Aged Brie", 5, 10);
        ItemUpdater updater = ItemUpdaterFactory.getUpdater(item);
        assertTrue(updater instanceof AgedBrieUpdater);
    }

    @Test
    void testSulfurasUpdaterCreation() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        ItemUpdater updater = ItemUpdaterFactory.getUpdater(item);
        assertTrue(updater instanceof SulfurasUpdater);
    }

    @Test
    void testBackstagePassUpdaterCreation() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        ItemUpdater updater = ItemUpdaterFactory.getUpdater(item);
        assertTrue(updater instanceof BackstagePassUpdater);
    }

    @Test
    void testConjuredItemUpdaterCreation() {
        Item item = new Item("Conjured Mana Cake", 3, 6);
        ItemUpdater updater = ItemUpdaterFactory.getUpdater(item);
        assertTrue(updater instanceof ConjuredItemUpdater);
    }

}
