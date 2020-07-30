import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CommandThreeTest {
    @Test
    public void should_return_one_integration_for_20_yuan_when_user_buy_goods_more_than_1000(){
        Goods goods = new Goods("冰箱",2350,1);
        List<Goods> goodsList = new ArrayList<Goods>();
        goodsList.add(goods);
        IntegrationSys integrationSys = new IntegrationSys();
        User user = new User("001",0);
        integrationSys.add(user,goodsList);
        Assert.assertEquals(1067,user.getPersonIntegration());

    }

    public void should_return_one_integration_for_1_yuan_when_user_buy_sale_goods_and_goods_more_than_1000(){
        Goods goods = new Goods("电视机",2000,1);
        List<Goods> goodsList = new ArrayList<Goods>();
        goodsList.add(goods);
        IntegrationSys integrationSys = new IntegrationSys();
        User user = new User("001",0);
        integrationSys.add(user,goodsList);
        Assert.assertEquals(3000,user.getPersonIntegration());

    }
}
