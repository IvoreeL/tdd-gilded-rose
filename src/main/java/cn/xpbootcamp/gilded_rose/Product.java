package cn.xpbootcamp.gilded_rose;

public class Product {

    private static final int DEFAULT_UPDATE_PERIOD = -1;
    private static final int DEFAULT_QUALITY_VARIATION = -1;
    private int sellIn;
    private int quality;
    private ProductType productType;

    public Product(int sellIn, int quality, ProductType productType) {
        this.sellIn = sellIn;
        this.quality = quality;
        this.productType = productType;
    }

    public Product(int sellIn, int quality) {
        this(sellIn, quality, ProductType.COMMON);
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void updateProduct(){
        updateQuality(DEFAULT_QUALITY_VARIATION);
        updateSellIn(DEFAULT_UPDATE_PERIOD);
    }

    public void updateSellIn(int update_period) {
        this.sellIn = Math.max(0, this.sellIn + update_period);
    }

    public void updateQuality(int quality_variation) {
        if (this.sellIn != 0) {
            this.quality = Math.min(Math.max(0, this.quality + quality_variation), 50);
        }else{
            this.quality = Math.max(0, this.quality + quality_variation * 2);
        }
    }
}
