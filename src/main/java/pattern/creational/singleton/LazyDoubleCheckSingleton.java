package pattern.creational.singleton;

public class LazyDoubleCheckSingleton {
    //禁止重排序
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton(){

    }

    /*
    * 通过加锁解决多线程创建多个对象
    * */
    public  static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null) lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                /*
                * 1分配内存
                * 2初始化对象
                * 3设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                *
                *保证重排序不会改变单线程内的程序执行结果。
                * intra-thread semantics
                * */
            }

        }
        return lazyDoubleCheckSingleton;
    }
}
