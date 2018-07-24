package com.gildedrose;

import java.util.List;

class GildedRoseRefactored {

    private final ItemUpdaterStrategyFactory itemUpdaterStrategyFactory = new ItemUpdaterStrategyFactory();

    public void updateQuality(List<Item> items) {
        for (Item item : items) {
            itemUpdaterStrategyFactory.getItemUpdater(item).update(item);
        }
    }

}