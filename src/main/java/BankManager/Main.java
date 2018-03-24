package BankManager;

public class Main {
    public static void main(String[] args){
        CheckingAccount checkingAccount = new CheckingAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        CertificateOfDeposit certificateOfDeposit = new CertificateOfDeposit();

        checkingAccount.getAccountNumber();
        certificateOfDeposit.setBalance(100.50);
        System.out.println(certificateOfDeposit.getBalance());
    }
}
