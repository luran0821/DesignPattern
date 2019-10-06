package pattern.structural.bridge;

public class ICBIBank extends Bank {
    public ICBIBank(Account account) {
        super(account);
    }

    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}
