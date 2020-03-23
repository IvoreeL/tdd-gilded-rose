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
        if (this.sellIn + update_period < 0) {
            this.sellIn = 0;
        }else{
            this.sellIn += update_period;
        }
    }

    public void updateQuality(int quality_variation) {
        if (this.sellIn != 0) {
            if (this.quality + quality_variation < 0) {
                this.quality = 0;
            }else if (this.quality + quality_variation > 50) {
                this.quality = 50;
            } else{
                this.quality += quality_variation;
            }
        }else{
            if (this.quality + quality_variation * 2 < 0) {
                this.quality = 0;
            }else{
                this.quality += quality_variation * 2;
            }
        }
    }
}
