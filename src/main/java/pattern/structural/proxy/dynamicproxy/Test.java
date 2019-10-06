package pattern.structural.proxy.dynamicproxy;

import pattern.structural.proxy.IOrderService;
import pattern.structural.proxy.Order;
import pattern.structural.proxy.OrderServiceImpl;


public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        IOrderService iOrderServiceDynamicProxy =
                (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        iOrderServiceDynamicProxy.saveOrder(order);
    }
}
