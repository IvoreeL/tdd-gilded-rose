package cn.xpbootcamp.gilded_rose;


import cn.xpbootcamp.gilded_rose.Exceptions.QualityValueException;
import cn.xpbootcamp.gilded_rose.Exceptions.SellInValueException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class ProductTest {

    @Test
    void shouldCreateProductSuccessfully() {
        Product product = new Product(10, 1);
        assertEquals(product.getSellIn(), 10);
        assertEquals(product.getQuality(), 1);
    }

    @Test
    void failToCreateProductWhenQualityIsInvalid() {
        final int NEGATIVE_QUALITY = -1;
        final int HIGH_QUALITY = 51;

        assertThrows(QualityValueException.class, () -> {
            ProductManufacturer.createProduct(10, NEGATIVE_QUALITY);
        });
        assertThrows(QualityValueException.class, () -> {
            ProductManufacturer.createProduct(10, HIGH_QUALITY);
        });
    }

    @Test
    void failToCreateProductWhenSellInIsInvalid() {
        final int NEGATIVE_SELLIN = -1;
        assertThrows(SellInValueException.class, () -> {
            ProductManufacturer.createProduct(NEGATIVE_SELLIN, 10);
        });
    }

}
