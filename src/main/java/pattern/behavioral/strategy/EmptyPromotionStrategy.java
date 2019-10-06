package pattern.behavioral.strategy;

public class EmptyPromotionStrategy  implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
