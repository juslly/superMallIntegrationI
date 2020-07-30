import java.util.Arrays;
import java.util.List;

public class IntegrationSys {
    private List<String> saleGoodsTypes = Arrays.asList(GoodsType.苹果.toString(), GoodsType.西瓜.toString(), GoodsType.牛肉.toString(),GoodsType.电视机.toString());
    public User add(User user, List<Goods> goodsList) {
        int integrationAdd = 0;
        for(Goods goods : goodsList){
            if(isSaleGoods(goods.getGoodsName())){
                if(calculatePrice(goods) > 1000){
                    integrationAdd += 1000 * 2 + ((calculatePrice(goods) - 1000));
                }else{
                    integrationAdd += calculatePrice(goods) * 2;
                }
            }else{
                if(calculatePrice(goods) > 1000){
                    integrationAdd += 1000 + ((calculatePrice(goods) - 1000) / 20);
                }else{
                    integrationAdd += calculatePrice(goods);
                }

            }

        }
        int sumIntegration = user.getPersonIntegration() + integrationAdd;
        user.setPersonIntegration(sumIntegration);
        return user;
    }

    private double calculatePrice(Goods goods) {
        return goods.getGoodsPrice() * goods.getGoodsCount();
    }

    private boolean isSaleGoods(String goodsName) {
        return saleGoodsTypes.contains(goodsName);
    }
}
