package pattern.structural.proxy.db;

public class DataSourceContextHolder {
    private  static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<String>();

    public static void setDBtype(String dbtype){
        CONTEXT_HOLDER.set(dbtype);
    }
    public static String getDBtype(){
      return (String)CONTEXT_HOLDER.get();
    }
    public static void clearDBtype(){
        CONTEXT_HOLDER.remove();
    }
}
