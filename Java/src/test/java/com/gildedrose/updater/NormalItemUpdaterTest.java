package com.gildedrose.updater;

import org.junit.jupiter.api.Test;
import com.gildedrose.Item;
import static org.junit.jupiter.api.Assertions.*;

public class NormalItemUpdaterTest {

	@Test
	void qualityDecreasesByOneBeforeSellDate() {
		Item item = new Item("Normal Item", 10, 20);
		new NormalItemUpdater().update(item);
		assertEquals(9, item.sellIn);
		assertEquals(19, item.quality);
	}

	@Test
	void qualityDecreasesByTwoAfterSellDate() {
		Item item = new Item("Normal Item", 0, 20);
		new NormalItemUpdater().update(item);
		assertEquals(-1, item.sellIn);
		assertEquals(18, item.quality);
	}

	@Test
	void qualityNeverNegative() {
		Item item = new Item("Normal Item", 5, 0);
		new NormalItemUpdater().update(item);
		assertEquals(4, item.sellIn);
		assertEquals(0, item.quality);
	}
}
