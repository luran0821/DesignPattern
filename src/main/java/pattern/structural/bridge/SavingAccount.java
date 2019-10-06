package pattern.structural.bridge;

public class SavingAccount implements Account {
    public Account openAccount() {
        System.out.println("打开活期张号");
        return new SavingAccount();
    }

    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
