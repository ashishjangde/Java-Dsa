 class AccesModifiers {
    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount("John", "1234", 1000);
        System.out.println(account1.getBalance()); // 1000
        account1.deposit(500);
        System.out.println(account1.getBalance()); // 1500
        account1.withdraw(200);
        System.out.println(account1.getBalance()); // 1300
        account1.setPassword("5678");
        System.out.println(account1.getPassword()); // 5678
        
        System.out.println(account1.username); // John
    }
}

class BankAccount{
    public String username; // public access modifier allows access to this field
    private String password;  // private access modifier restricts access to this field
    int balance;  // default access modifier is package-private



    public BankAccount(String username, String password, int balance){  // constructor with parameters
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public void deposit(int amount){ // method to deposit money
        balance += amount;
    }

    public void withdraw(int amount){ // method to withdraw money
        balance -= amount;
    }

    public int getBalance(){ // method to get balance
        return balance;
    }
    public void setPassword(String password){ // method to set password
        this.password = password;
    }   
    public String getPassword(){ // method to get password
        return password;
    }

}