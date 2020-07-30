public class Goods {
    private String goodsName;
    private double goodsPrice;
    private int goodsCount;
    private GoodsType goodsType;


    public Goods(String goodsName, double goodsPrice, int goodsCount) {
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsCount = goodsCount;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public int getGoodsCount() {
        return goodsCount;
    }
}
