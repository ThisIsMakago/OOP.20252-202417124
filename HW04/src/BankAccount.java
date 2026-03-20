public class BankAccount {
    private String number;
    private String name;
    private double balance;
    public static final double MINIMUM_BALANCE = 50000;
    public static final double TRANSFER_FEE_RATE = 0.02;

    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        if (initialBalance < MINIMUM_BALANCE) {
            System.out.println("Error. Initial balance must be at least 50000. (" + initialBalance + ")");
            return;
        }
        this.number = accountNumber;
        this.name = ownerName;
        this.balance = initialBalance;
    }

    public void depositMoney(double amount) {
        if(amount > 0) {
            this.balance += amount;
            System.out.println("Successfully deposited " + amount);
            System.out.println("Current balance: " + this.balance);
        }
        else {
            System.out.println("Deposit failed. Deposit amount must be greater than zero. (" + amount + ")");
        }
    }

    public void withdrawMoney(double amount) {
        if(amount > 0) {
            if(this.balance - amount >= MINIMUM_BALANCE){
                this.balance -= amount;
                System.out.println("Successfully withdrawn " + amount);
                System.out.println("Current balance: " + this.balance);
            }    
            else {
                System.out.println("Withdraw failed. Remaining balance must be at least 50000. (" + (this.balance - amount) + ")");
            }
        }
        else {
            System.out.println("Withdraw failed. Withdraw amount must be greater than zero. (" + amount + ")");
        }
    }

    public void transferMoney(BankAccount receiverAccount, double amount) {
        if(amount > 0) {
            double fee = amount * TRANSFER_FEE_RATE;
            if(this.balance - amount - fee >= MINIMUM_BALANCE) {
                this.balance -= amount + fee;
                receiverAccount.balance += amount;
                System.out.println("     RECEIPT");
                System.out.println("Successfully transferred " + amount + " with 2% fee: " + fee);
                System.out.println("Sender: " + this.name);
                System.out.println("Receiver: " + receiverAccount.name);
                System.out.println("Current balance: " + this.balance);
            }
            else {
                System.out.println("Transfer failed. Remaining balance must be at least 50000. (" + (this.balance - amount - fee) + ")");
            }
        }
        else {
            System.out.println("Transfer failed. Transfer amount must be greater than zero. (" + amount + ")");
        }
    }

    public void payBill(String billName, double amount) {
        if(amount > 0) {
            if(this.balance - amount >= MINIMUM_BALANCE){
                this.balance -= amount;
                System.out.println("Successfully paid " + amount + " for " + billName);
                System.out.println("Current balance: " + this.balance);
            }   
            else {
                System.out.println("Pay failed. Remaining balance must be at least 50000. (" + (this.balance - amount) + ")");
            }
        }
        else {
            System.out.println("Pay failed. Pay amount must be greater than zero. (" + amount + ")");
        }
    }

    public void finalBalance() {
        System.out.println(this.name + " final balance: " + this.balance);
    }
}
