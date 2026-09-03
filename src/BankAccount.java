public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner){
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double money) {
        if(money <= 0){
            System.out.println("存款金额不合法: " + money);
            return;
        }
        balance = balance + money;
    }

    public void withdraw(double money) {
        if(money <= 0 ) {
            System.out.println("取款金额不合法: " + money);
            return;
        }
        if(money > balance){
            System.out.println("余额不足,当前余额: " + balance);
            return;
        }
        balance = balance - money;
    }


}
