import org.jetbrains.annotations.Contract;

public class Account {
    private int accountNumber;
    private double accountBalance;
    private String email;
    private int phoneNumber;

    private static String bankName;

    public String bankName() {
        return bankName;
    }

    @Override
    public String toString() {
        return "Account {" +
                "accountNumber= " + accountNumber +
                ", accountBalance=" + accountBalance +
                ", email= '" + email + '\'' +
                ", phoneNumber= " + phoneNumber +
                '}';
    }

    public static void setBankName(String bankName) {
        Account.bankName = bankName;
    }

    public Account() {
        this(12324567, 345.60, "abc@gmail.com", 91823444);
        System.out.println("empty constructor called");
    }


    public Account(int accountNumber, double accountBalance, String email, int phoneNumber) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println(" constructor called with initial parameters");

    }


    public int accountNumber() {
        return accountNumber;
    }

    public Account setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public double accountBalance() {
        return accountBalance;
    }

    public Account setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
        return this;
    }

    public int phoneNumber() {
        return phoneNumber;
    }

    public Account setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String email() {
        return email;
    }

    public Account setEmail(String email) {
        this.email = email;
        return this;
    }


    public void depositFund(double amount) {
        this.accountBalance += amount;
        System.out.println("amount added successfully your current Balance is " + this.accountBalance + " $");
    }

    public double withdrawFund(double withDrawlAmount) {
        if (accountBalance - withDrawlAmount > 0) {
            System.out.println("remaining balance is after wiwithdrawFund " + (accountBalance - withDrawlAmount));
            return this.accountBalance - withDrawlAmount;
        }
        return -1;
    }
}
