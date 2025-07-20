package OOPS;

public class OOPS2 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.username = "John";
        // b1.password = "1234"; // Error: The field bankAccount.password is not visible
        b1.setPassword("A123");
    }
}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
}
