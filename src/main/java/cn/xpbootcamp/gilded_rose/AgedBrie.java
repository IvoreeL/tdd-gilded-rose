package cn.xpbootcamp.gilded_rose;

public class AgedBrie extends Product {

    private static final int DEFAULT_AGED_BRIE_UPDATE_PERIOD = 1;
    private static final int DEFAULT_AGED_BRIE_QUALITY_VARIATION = 1;

    public AgedBrie(Integer sellIn, Integer quality) {
        super(sellIn, quality, ProductType.AGED_BRIE);
    }

    @Override
    public void updateProduct() {
        updateQuality(DEFAULT_AGED_BRIE_UPDATE_PERIOD);
        updateSellIn(DEFAULT_AGED_BRIE_QUALITY_VARIATION);
    }
}
