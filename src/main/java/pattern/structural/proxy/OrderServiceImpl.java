package pattern.structural.proxy;

public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;

    public int saveOrder(Order order) {
        iOrderDao = new IOrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");

        return iOrderDao.insert(order);
    }
}
