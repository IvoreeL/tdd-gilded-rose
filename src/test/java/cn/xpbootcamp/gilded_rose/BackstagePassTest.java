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

    @Test
    void shouldIncreaseQualityWithDefaultValueWhenCloserToShowCase() throws QualityValueException, SellInValueException {
        Product backstagePass = ProductManufacturer.createProduct(ProductType.BACKSTAGE_PASS, 30, 10);
        backstagePass.updateProduct();
        assertEquals(backstagePass.getSellIn(), 29);
        assertEquals(backstagePass.getQuality(), 11);
    }
}
