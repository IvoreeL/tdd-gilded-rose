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

    @Test
    void qualityCannotBeLargerThan50EvenForBackstagePass() throws QualityValueException, SellInValueException {
        Product backstagePass = ProductManufacturer.createProduct(ProductType.BACKSTAGE_PASS, 30, 50);
        backstagePass.updateProduct();
        assertEquals(backstagePass.getQuality(), 50);
    }

    @Test
    void shouldIncreaseQualityWith2PtsBefore10days() throws QualityValueException, SellInValueException {
        Product backstagePass = ProductManufacturer.createProduct(ProductType.BACKSTAGE_PASS, 11, 10);
        backstagePass.updateProduct();
        backstagePass.updateProduct();
        assertEquals(backstagePass.getQuality(), 13);
    }

    @Test
    void shouldIncreaseQualityWith3PtsBefore5days() throws QualityValueException, SellInValueException {
        Product backstagePass = ProductManufacturer.createProduct(ProductType.BACKSTAGE_PASS, 6, 10);
        backstagePass.updateProduct();
        backstagePass.updateProduct();
        assertEquals(backstagePass.getQuality(), 15);
    }

    @Test
    void shouldSetQualityToZeroAfterSellInDays() throws QualityValueException, SellInValueException {
        Product backstagePass = ProductManufacturer.createProduct(ProductType.BACKSTAGE_PASS, 1, 10);
        backstagePass.updateProduct();
        backstagePass.updateProduct();
        assertEquals(backstagePass.getQuality(), 0);
    }
}
