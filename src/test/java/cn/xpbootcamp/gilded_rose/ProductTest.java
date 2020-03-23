package cn.xpbootcamp.gilded_rose;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProductTest {

    @Test
    void shouldCreateProductSuccessfully() {
        Product product = new Product(10, 1);
        assertEquals(product.getSellIn(), 10);
        assertEquals(product.getQuality(), 1);
    }

}
