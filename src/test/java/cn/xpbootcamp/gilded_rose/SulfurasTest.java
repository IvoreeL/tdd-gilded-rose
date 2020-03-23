package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.Exceptions.QualityValueException;
import cn.xpbootcamp.gilded_rose.Exceptions.SellInValueException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SulfurasTest {

    @Test
    void shouldCreateSulfurasSuccessfully() throws QualityValueException, SellInValueException {
        Product sulfuras = ProductManufacturer.createProduct(1);
        assertEquals(sulfuras.getProductType().name(), "SULFURAS");
        assertEquals(sulfuras.getQuality(), 1);
    }

    @Test
    void shouldKeepQualityAndSellInUnchanged() throws QualityValueException, SellInValueException {
        Product sulfuras = ProductManufacturer.createProduct(1);
        sulfuras.updateProduct();
        sulfuras.updateProduct();
        assertEquals(sulfuras.getQuality(), 1);
    }
}
