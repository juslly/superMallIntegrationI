public class IntegrationSys {

    public User add(User user, Goods goods) {
        double sumPrice = goods.goodsPrice * goods.goodsCount;
        int integrationAdd = (int) sumPrice;
        int sumIntegration = user.getPersonIntegration() + integrationAdd;
        user.setPersonIntegration(sumIntegration);
        return user;
    }
}
