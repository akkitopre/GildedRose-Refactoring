package com.gildedrose.updater;

import org.junit.jupiter.api.Test;
import com.gildedrose.Item;
import static org.junit.jupiter.api.Assertions.*;

public class AgedBrieUpdaterTest {

	@Test
	void qualityIncreasesByOneBeforeSellDate() {
		Item item = new Item("Aged Brie", 5, 10);
		new AgedBrieUpdater().update(item);
		assertEquals(4, item.sellIn);
		assertEquals(11, item.quality);
	}

	@Test
	void qualityIncreasesByTwoAfterSellDate() {
		Item item = new Item("Aged Brie", 0, 10);
		new AgedBrieUpdater().update(item);
		assertEquals(-1, item.sellIn);
		assertEquals(12, item.quality);
	}

	@Test
	void qualityNeverExceeds50() {
		Item item = new Item("Aged Brie", 5, 50);
		new AgedBrieUpdater().update(item);
		assertEquals(4, item.sellIn);
		assertEquals(50, item.quality);
	}
}
