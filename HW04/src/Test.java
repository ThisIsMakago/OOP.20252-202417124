public class Test {
    public static void main(String[] args) {
        System.out.println("1. Bank account test:");
        BankAccount account1 = new BankAccount("12345", "Nguyen Van A", 1500000);
        BankAccount account2 = new BankAccount("56789", "Le Van B", 60000);
        BankAccount account3 = new BankAccount("13579", "Pham Van C", 75000);
        BankAccount account4 = new BankAccount("02468", "Tran Van D", 49999);

        System.out.println("2. Deposit money test:");
        account1.depositMoney(10000);
        account2.depositMoney(0);
        account3.depositMoney(-1);

        System.out.println("3. Withdraw money test:");
        account1.withdrawMoney(60000);
        account2.withdrawMoney(0);
        account3.withdrawMoney(25001);

        System.out.println("4. Transfer money test:");
        account1.transferMoney(account2, 30000);
        account2.transferMoney(account3, 50000);
        account3.transferMoney(account1, 5000);

        System.out.println("5. Pay bill test:");
        account1.payBill("Electricity", 20000);
        account2.payBill("Water", 10000);
        account3.payBill("Food", 30000);

        System.out.println("6. Final balance:");
        account1.finalBalance();
        account2.finalBalance();
        account3.finalBalance();
    }
}
