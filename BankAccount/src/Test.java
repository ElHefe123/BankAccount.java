public class Test {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setFirstName("John");
        bankAccount.setLastName("Doe");
        bankAccount.setAccountID(12345);
        bankAccount.deposit(1000);
        bankAccount.withdrawal(200);
        bankAccount.accountSummary();

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setFirstName("Jane");
        checkingAccount.setLastName("Smith");
        checkingAccount.setAccountID(54321);
        checkingAccount.deposit(500);
        checkingAccount.processWithdrawal(700);
        checkingAccount.setInterestRate(2.5);
        checkingAccount.displayAccount();
    }
}