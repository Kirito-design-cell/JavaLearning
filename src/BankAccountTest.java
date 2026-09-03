public class BankAccountTest {
    public static void main(String[] args){
        BankAccount acct = new BankAccount("小明");
        acct.deposit(1000);
        acct.withdraw(500);
        acct.withdraw(2000);
        System.out.println(acct.getBalance());
    }
}
