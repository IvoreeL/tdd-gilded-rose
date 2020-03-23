package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.Exceptions.QualityValueException;

public class ProductManufacturer {

    public static Product createProduct(int sellIn, int quality) throws QualityValueException {
        validateQuality(quality);
        return new Product(sellIn, quality);
    }

    public static void validateQuality(int quality) throws QualityValueException {
        if (quality < 0 || quality > 50){
            throw new QualityValueException("Quality is out of range.");
        }
    }
}
