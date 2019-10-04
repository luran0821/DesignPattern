package pattern.creational.singleton;

public class T implements Runnable {
    public void run() {
        //LazySingleton lazySingleton = LazySingleton.getInstance();
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+lazyDoubleCheckSingleton);
    }
}
