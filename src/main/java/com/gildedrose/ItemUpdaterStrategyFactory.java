package com.gildedrose;

public class ItemUpdaterStrategyFactory {
    public ItemUpdaterStrategyFactory() {
    }

    ItemUpdater getItemUpdater(Item item) {
        if (item.name.equals("Aged Brie")) {
            return new AgedBrieUpdater();
        } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return new BackstageUpdater();
        } else if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return new DefaultItemUpdater();
        }
        return new ItemUpdater() {
            @Override
            public void update(Item item) {

            }
        };
    }
}