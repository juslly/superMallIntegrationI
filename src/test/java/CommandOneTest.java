import org.junit.Assert;
import org.junit.Test;

public class CommandOneTest {
    @Test
    public void should_return_100Integration_when_user_buy_goodsFor100(){
        Goods goods = new Goods("苹果",10,10);
        IntegrationSys integrationSys = new IntegrationSys();
        User user = new User("001");
        integrationSys.add(user,goods);
        Assert.assertEquals(user.getPersonIntegration(),100);

    }
}
