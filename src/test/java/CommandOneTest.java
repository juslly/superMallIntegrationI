import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CommandOneTest {
    @Test
    public void should_return_100Integration_when_user_buy_goodsFor100(){
        Goods goods = new Goods("棒棒糖",1,100);
        List<Goods> goodsList = new ArrayList<Goods>();
        goodsList.add(goods);
        IntegrationSys integrationSys = new IntegrationSys();
        User user = new User("001",0);
        integrationSys.add(user,goodsList);
        Assert.assertEquals(user.getPersonIntegration(),100);

    }
}
