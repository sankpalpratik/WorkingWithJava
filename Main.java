public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.withdrawFunds(100.0);

        myAccount.depositFunds(400.0);
        myAccount.withdrawFunds(150.0);
    }
}
