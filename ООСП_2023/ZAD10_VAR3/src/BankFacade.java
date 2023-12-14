class BankFacade {
    private Account account;

    public BankFacade(int initialBalance) {
        this.account = new Account(initialBalance);
    }

    public int checkBalance() {
        return account.getBalance();
    }

    public void deposit(int amount, String depositMethod) {
        account.deposit(amount, depositMethod);
    }

    public void transfer(int amount, String recipientPhoneNumber) {
        account.transfer(amount, recipientPhoneNumber);
    }
}