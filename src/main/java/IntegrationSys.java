import java.util.Arrays;
import java.util.List;

public class IntegrationSys {
    private List<String> saleGoodsTypes = Arrays.asList(GoodsType.苹果.toString(), GoodsType.西瓜.toString(), GoodsType.牛肉.toString(),GoodsType.电视机.toString());
    public User add(User user, List<Goods> goodsList) {
        int integrationAdd = 0;
        //计算促销商品增加积分
        integrationAdd = getIntegrationAddForSaleGoods(goodsList, integrationAdd);
        //计算普通商品增加积分
        integrationAdd = getIntegrationAddForUsual(goodsList, integrationAdd);

        int sumIntegration = user.getPersonIntegration() + integrationAdd;
        user.setPersonIntegration(sumIntegration);
        return user;
    }

    private int getIntegrationAddForUsual(List<Goods> goodsList, int integrationAdd) {
        double sumPrice = 0;
        for(Goods goods : goodsList){
            if(!isSaleGoods(goods.getGoodsName())){
                sumPrice += calculatePrice(goods);
            }
        }
        if(integrationAdd / 2 > 1000){
            integrationAdd += sumPrice / 20;
        }else{
            if(integrationAdd / 2 + sumPrice > 1000){
                integrationAdd += (1000 - integrationAdd / 2) + (sumPrice - (1000 - integrationAdd / 2)) / 20;

            }else{
                integrationAdd += sumPrice;
            }

        }
        return integrationAdd;
    }

    private int getIntegrationAddForSaleGoods(List<Goods> goodsList, int integrationAdd) {
        double sumPrice = 0;
        for(Goods goods : goodsList){
            if(isSaleGoods(goods.getGoodsName())){
                sumPrice += calculatePrice(goods);
            }
        }
        if(sumPrice > 1000){
            integrationAdd += 1000 * 2 + (sumPrice - 1000);
        }else{
            integrationAdd += sumPrice * 2;
        }
        return integrationAdd;
    }

    private double calculatePrice(Goods goods) {
        return goods.getGoodsPrice() * goods.getGoodsCount();
    }

    private boolean isSaleGoods(String goodsName) {
        return saleGoodsTypes.contains(goodsName);
    }
}
