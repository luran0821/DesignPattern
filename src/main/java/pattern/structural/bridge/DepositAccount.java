package pattern.structural.bridge;

public class DepositAccount implements Account {
    public Account openAccount() {
        System.out.println("打开定期张号");
        return new DepositAccount();
    }

    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
