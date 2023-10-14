public class CheckingAccount extends BankAccount {
        private double interestRate;

        public CheckingAccount() {
            super();
            interestRate = 0.0;
        }

        public void processWithdrawal(double amount) {
            if (getBalance() - amount < 0) {
                withdrawal(30.0);
                System.out.println("Overdraft Fee: $30.00");
            }
            withdrawal(amount);
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void displayAccount() {
            accountSummary();
            System.out.println("Interest Rate: " + interestRate + "%");
        }
    }


