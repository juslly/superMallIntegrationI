import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CommandTwoTest {
    @Test
    public void should_return_two_double_integration_when_user_buy_sales_goods(){
        Goods goods1 = new Goods("苹果",10,1);
        Goods goods2 = new Goods("西瓜",10,3);
        Goods goods3 = new Goods("洗衣液",20,1);
        List<Goods> goodsList = new ArrayList<Goods>();
        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods3);
        IntegrationSys integrationSys = new IntegrationSys();
        User user = new User("001",0);
        integrationSys.add(user,goodsList);
        Assert.assertEquals(100,user.getPersonIntegration());

    }
}
