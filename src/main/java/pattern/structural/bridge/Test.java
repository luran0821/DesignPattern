package pattern.structural.bridge;

public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBIBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();


        Bank icbcBank1 = new ICBIBank(new SavingAccount());
        Account icbcAccount1 = icbcBank1.openAccount();
        icbcAccount1.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();

    }
}
