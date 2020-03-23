package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.Exceptions.QualityValueException;
import cn.xpbootcamp.gilded_rose.Exceptions.SellInValueException;

public class ProductManufacturer {

    public static Product createProduct(ProductType productType, int sellIn, int quality) throws QualityValueException, SellInValueException {
        validateSellIn(sellIn);
        validateQuality(quality);
        switch (productType){
            case AGED_BRIE:
                return createAgedBrie(sellIn, quality);
            case SULFURAS:
                return createSulfuras(quality);
            case BACKSTAGE_PASS:
                return createBackstagePass(sellIn, quality);
            default:
                return createCommonProduct(sellIn, quality);
        }
    }

    public static Product createProduct(int sellIn, int quality) throws QualityValueException, SellInValueException {
        return createProduct(ProductType.COMMON, sellIn, quality);
    }

    public static Product createProduct(int quality) throws QualityValueException, SellInValueException {
        final int DEFAULT_SULFURAS_SELL_IN = 0;
        return createProduct(ProductType.SULFURAS, DEFAULT_SULFURAS_SELL_IN, quality);
    }

    private static Product createCommonProduct(int sellIn, int quality) {
        return new Product(sellIn, quality, ProductType.COMMON);
    }

    private static Product createAgedBrie(int sellIn, int quality)  {
        return new AgedBrie(sellIn, quality);
    }

    private static Product createSulfuras(int quality) {
        return new Sulfuras(quality);
    }

    private static Product createBackstagePass(int sellIn, int quality) {
        return new BackstagePass(sellIn, quality);
    }

    private static void validateQuality(int quality) throws QualityValueException {
        if (quality < 0 || quality > 50){
            throw new QualityValueException("Quality is out of range.");
        }
    }

    private static void validateSellIn(int sellIn) throws SellInValueException {
        if (sellIn < 0) {
            throw new SellInValueException("Sell-in value is negative.");
        }
    }
}
