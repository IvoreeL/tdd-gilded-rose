package cn.xpbootcamp.gilded_rose;

public class BackstagePass extends Product {

    private static final int DEFAULT_BACKSTAGE_PASS_UPDATE_PERIOD = 1;
    private static final int DEFAULT_BACKSTAGE_PASS_QUALITY_VARIATION = -1;

    public BackstagePass(int sellIn, int quality) {
        super(sellIn, quality, ProductType.BACKSTAGE_PASS);
    }

    @Override
    public void updateProduct() {
        updateQuality(DEFAULT_BACKSTAGE_PASS_QUALITY_VARIATION);
        updateSellIn(DEFAULT_BACKSTAGE_PASS_UPDATE_PERIOD);
    }
}
