package pattern.behavioral.strategy;

public class Test {
    public static void main(String[] args) {
       /*
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        PromotionActivity promotionActivity111 = new PromotionActivity(new FanXianPromotionStrategy());

        promotionActivity111.executePromotionStrategy();
        promotionActivity618.executePromotionStrategy();
        */

       String promotionKey = "LIJIAN";
       PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
       promotionActivity.executePromotionStrategy();

        String promotionKey1 = "MANJIAN";
        PromotionActivity promotionActivity1 = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey1));
        promotionActivity1.executePromotionStrategy();


        String promotionKey2 = "XXXX";
        PromotionActivity promotionActivity2 = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey2));
        promotionActivity2.executePromotionStrategy();
    }
}
