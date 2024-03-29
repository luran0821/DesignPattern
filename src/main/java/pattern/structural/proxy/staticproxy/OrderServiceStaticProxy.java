package pattern.structural.proxy.staticproxy;

import pattern.structural.proxy.IOrderService;
import pattern.structural.proxy.Order;
import pattern.structural.proxy.OrderServiceImpl;
import pattern.structural.proxy.db.DataSourceContextHolder;

public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order){
        beforMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);

        afterMethod();
        return result;
    }

    private  void beforMethod(Order order){
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到 ["+ dbRouter +"] 处理数据");
        //设置DataSource
        DataSourceContextHolder.setDBtype("db" + String.valueOf(dbRouter));
        System.out.println("静态代理 before code");
    }

    private  void afterMethod(){
        System.out.println("静态代理 after code");
    }
}
