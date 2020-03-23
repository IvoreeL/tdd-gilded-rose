package cn.xpbootcamp.gilded_rose;


import cn.xpbootcamp.gilded_rose.Exceptions.QualityValueException;
import cn.xpbootcamp.gilded_rose.Exceptions.SellInValueException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AgedBrieTest {

    @Test
    void shouldCreateAgedBrieSuccessfully() throws QualityValueException, SellInValueException {
        Product agedBrie = ProductManufacturer.createProduct(ProductType.AGED_BRIE, 1, 1);
        assertEquals(agedBrie.getProductType().name(), "AGED_BRIE");
        assertEquals(agedBrie.getSellIn(), 1);
        assertEquals(agedBrie.getQuality(), 1);
    }

    @Test
    void shouldUpdateQualityAndSellInCorrectlyWithDefaultValue() throws QualityValueException, SellInValueException {
        Product agedBrie = ProductManufacturer.createProduct(ProductType.AGED_BRIE, 1, 49);
        agedBrie.updateProduct();
        assertEquals(agedBrie.getSellIn(), 2);
        assertEquals(agedBrie.getQuality(), 50);
    }

    @Test
    void qualityCannotBeLargerThan50EvenForAgedBrie() throws QualityValueException, SellInValueException {
        Product agedBrie = ProductManufacturer.createProduct(ProductType.AGED_BRIE, 1, 49);
        agedBrie.updateProduct();
        agedBrie.updateProduct();
        assertEquals(agedBrie.getSellIn(), 3);
        assertEquals(agedBrie.getQuality(), 50);
    }
}
