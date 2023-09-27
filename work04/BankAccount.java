package int101s2023h01.src.main.java.int101.work04;

public class BankAccount {
    private int number;
    private Person owner;
    private double balance;

    public BankAccount(int number, Person owner){
        this.number = number;
        this.owner = owner;
    }
    public Person getOwner(){
        return owner;
    }
    public double getBalance(){
        return balance;
    }
    public double deposit(double amount){
        return this.balance += amount;
    }
    public void withdrew(double amount){
        if (balance > amount){
            this.balance -= amount;
        }
    }
    public void transfer(double amount, BankAccount account){
        if (this.balance > amount){
            withdrew(amount);
            account.deposit(amount);
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "number = " + number +
                ", ID =" + owner.getId() +
                ", balance = " + balance +
                '}';
    }
}
