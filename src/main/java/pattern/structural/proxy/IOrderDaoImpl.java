package pattern.structural.proxy;

public class IOrderDaoImpl implements IOrderDao {
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
