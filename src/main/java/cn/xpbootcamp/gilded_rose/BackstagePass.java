package cn.xpbootcamp.gilded_rose;

public class BackstagePass extends Product {

    private static final int DEFAULT_BACKSTAGE_PASS_UPDATE_PERIOD = -1;
    private static final int DEFAULT_BACKSTAGE_PASS_QUALITY_VARIATION = 1;
    private static final int DEFAULT_BACKSTAGE_PASS_QUALITY_VARIATION_10_DAYS = 2;
    private static final int DEFAULT_BACKSTAGE_PASS_QUALITY_VARIATION_5_DAYS = 3;

    public BackstagePass(int sellIn, int quality) {
        super(sellIn, quality, ProductType.BACKSTAGE_PASS);
    }

    @Override
    public void updateProduct() {
        updateQuality(DEFAULT_BACKSTAGE_PASS_QUALITY_VARIATION);
        updateSellIn(DEFAULT_BACKSTAGE_PASS_UPDATE_PERIOD);
    }

    @Override
    public void updateQuality(int quality_variation) {
        final int sellIn = this.getSellIn();
        final int quality = this.getQuality();
        if (sellIn > 10) {
            setQuality(Math.min(quality + DEFAULT_BACKSTAGE_PASS_QUALITY_VARIATION, 50));
        }else if (sellIn > 5) {
            setQuality(Math.min(quality + DEFAULT_BACKSTAGE_PASS_QUALITY_VARIATION_10_DAYS, 50));
        }else if (sellIn > 0){
            setQuality(Math.min(quality + DEFAULT_BACKSTAGE_PASS_QUALITY_VARIATION_5_DAYS, 50));
        }else{
            setQuality(0);
        }
    }
}
