package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.Exceptions.QualityValueException;
import cn.xpbootcamp.gilded_rose.Exceptions.SellInValueException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BackstagePassTest {

    @Test
    void shouldCreateBackstagePassSuccessfully() throws QualityValueException, SellInValueException {
        Product backstagePass = ProductManufacturer.createProduct(ProductType.BACKSTAGE_PASS, 1, 10);
        assertEquals(backstagePass.getProductType().name(), "BACKSTAGE_PASS");
        assertEquals(backstagePass.getSellIn(), 1);
        assertEquals(backstagePass.getQuality(), 10);
    }
}
