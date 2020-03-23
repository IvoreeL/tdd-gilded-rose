package cn.xpbootcamp.gilded_rose;

public class Product {
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
}
