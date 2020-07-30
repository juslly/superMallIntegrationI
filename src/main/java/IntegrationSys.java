import java.util.Arrays;
import java.util.List;

public class IntegrationSys {
    private List<String> saleGoodsTypes = Arrays.asList(GoodsType.苹果.toString(), GoodsType.西瓜.toString(), GoodsType.牛肉.toString());
    public User add(User user, List<Goods> goodsList) {
        int integrationAdd = 0;
        for(Goods goods : goodsList){
            if(isSaleGoods(goods.getGoodsName())){
                integrationAdd += calculatePrice(goods) * 2;
            }else{
                integrationAdd += calculatePrice(goods);
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