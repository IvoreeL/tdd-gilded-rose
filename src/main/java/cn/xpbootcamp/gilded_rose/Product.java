package cn.xpbootcamp.gilded_rose;

public class Product {

    private static final int DEFAULT_UPDATE_PERIOD = 1;
    private static final int DEFAULT_QUALITY_VARIATION = 1;
    private int sellIn;
    private int quality;

    public Product(Integer sellIn, Integer quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void updateProduct(){
        updateQuality();
        updateSellIn();
    }

    private void updateSellIn() {
        if (this.sellIn - DEFAULT_UPDATE_PERIOD < 0) {
            this.sellIn = 0;
        }else{
            this.sellIn -= DEFAULT_UPDATE_PERIOD;
        }
    }

    private void updateQuality() {
        if (this.sellIn != 0) {
            if (this.quality - DEFAULT_QUALITY_VARIATION < 0) {
                this.quality = 0;
            }else{
                this.quality -= DEFAULT_QUALITY_VARIATION;
            }
        }else{
            if (this.quality - DEFAULT_QUALITY_VARIATION * 2 < 0) {
                this.quality = 0;
            }else{
                this.quality -= DEFAULT_QUALITY_VARIATION * 2;
            }
        }
    }
}
