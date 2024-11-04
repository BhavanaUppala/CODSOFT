package atminterface;

import javax.swing.*;

public class BankAccount {
    private double balance = 0;

    public void withdraw(double amount) {
        if (amount > balance) {
            JOptionPane.showMessageDialog(null, "Insufficient balance");
        } else {
            balance -= amount;
            JOptionPane.showMessageDialog(null, "Withdrawal successful! New balance: " + balance);
        }
    }

    public double checkBalance() {
        return balance; 
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            JOptionPane.showMessageDialog(null, "Deposit successful! New balance: " + balance);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid deposit amount.");
        }
    }
}
