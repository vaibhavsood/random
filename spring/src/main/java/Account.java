public interface Account {
    int accountNumber = 0;
    String accountType = null;
    int accountBalance = 0;

    String getAccountType();
    default int getAccountNumber() {return accountNumber;}
    default int getAccountBalance() {return accountBalance;}
}
