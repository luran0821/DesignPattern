package pattern.structural.proxy.dynamicproxy;

import pattern.structural.proxy.Order;
import pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {
    private Object target;

    public OrderServiceDynamicProxy(Object target){
        this.target = target;
    }

    public Object bind(){
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object agrObject = args[0];
        beforeMethod(agrObject);
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }

    public void beforeMethod(Object obj){
        int userId = 0;
        System.out.println("动态代理 before coed");
        if(obj instanceof Order){
            Order order = (Order) obj;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到 ["+ dbRouter +"] 处理数据");
        //设置DataSource
        DataSourceContextHolder.setDBtype("db" + String.valueOf(dbRouter));
    }

    private void afterMethod(){
        System.out.println("动态代理 after code");
    }


}
