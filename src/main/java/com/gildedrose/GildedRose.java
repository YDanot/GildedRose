package com.gildedrose;

import java.util.List;

class GildedRose {

    public void updateQuality(List<Item> items) {
        for (Item item : items) {
            if (item.name.equals("Aged Brie")) {
                updateBrieQuality(item);
            } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                updateBackstage(item);
            } else if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                updateQuality(item);
            }
        }
    }

    private void updateBackstage(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;

            if (item.sellIn < 11) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }

            if (item.sellIn < 6) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }

        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            item.quality = item.quality - item.quality;
        }
    }

    private void updateBrieQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }
    }

    private void updateQuality(Item item) {

        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }


        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {

            if (item.quality > 0) {
                item.quality = item.quality - 1;
            }

        }
    }
}