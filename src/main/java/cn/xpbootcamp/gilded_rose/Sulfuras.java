package cn.xpbootcamp.gilded_rose;

public class Sulfuras extends Product {

    private final static int DEFAULT_SULFURAS_SELL_IN = 0;

    public Sulfuras(int quality) {
        super(DEFAULT_SULFURAS_SELL_IN, quality, ProductType.SULFURAS);
    }

    @Override
    public void updateProduct() {}
}
