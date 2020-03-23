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


}
