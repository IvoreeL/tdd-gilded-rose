package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.Exceptions.QualityValueException;
import cn.xpbootcamp.gilded_rose.Exceptions.SellInValueException;

public class ProductManufacturer {

    public static Product createProduct(int sellIn, int quality) throws QualityValueException, SellInValueException {
        validateSellIn(sellIn);
        validateQuality(quality);
        return new Product(sellIn, quality);
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