class Account {
    private int balance;

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount, String depositMethod) {
        switch (depositMethod) {
            case "СБП":
                balance += amount;
                break;

            case "С карты другого банка":
                balance += amount - 5;
                break;

            case "С баланса телефона":
                balance += amount;
                break;

            default:
                System.out.println("Некорректный метод пополнения.");
        }
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    public void transfer(int amount, String recipientPhoneNumber) {
        System.out.println("Перевод " + amount + " на номер телефона " + recipientPhoneNumber);
        withdraw(amount);
    }
}