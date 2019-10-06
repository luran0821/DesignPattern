package pattern.behavioral.strategy;

public class FanXianPromotionStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("返现促销，返回的金额存放到幕课网用户的余额中");
    }
}
