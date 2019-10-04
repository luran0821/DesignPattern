package pattern.structural.facade;

public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T-shit");
        GiftExchangeService giftExchangeService = new GiftExchangeService();

        /*giftExchangeService.setPointsPaymentService(new PointsPaymentService());
        giftExchangeService.setQualifyService(new QualifyService());
        giftExchangeService.setShippingService(new ShippingService());
*/

        giftExchangeService.giftExchange(pointsGift);
    }
}
