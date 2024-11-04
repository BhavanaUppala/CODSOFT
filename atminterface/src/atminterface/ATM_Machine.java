package atminterface;

import java.awt.Font;

import javax.swing.*;

public class ATM_Machine {
	JFrame frame;
	JButton b1,b2,b3;
	JLabel l;
	JTextField amountField;
	BankAccount bankAccount;
	ATM_Machine(){
		ImageIcon  img=new ImageIcon(getClass().getResource("/atmicon.png"));
	    bankAccount=new BankAccount();
		frame=new JFrame("ATM");
		l=new JLabel("Choose your option"); 
		l.setBounds(100,50,200,50);
		l.setFont(new Font("Ariel",Font.BOLD,16));
		b1=new JButton("Deposit");
		b2=new JButton("Withdraw");
		b3=new JButton("Check Balance");
		b1.setBounds(100,100,150,50);
		b2.setBounds(100,150,150,50);
		b3.setBounds(100,200,150,50);
		amountField = new JTextField();
	    amountField.setBounds(100, 260, 150, 30);
	    amountField.setToolTipText("Enter amount here");

	        b1.addActionListener(e -> {
	            try {
	                double amount = Double.parseDouble(amountField.getText());
	                bankAccount.deposit(amount);
	                amountField.setText(""); 
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(frame, "Please enter a valid amount.");
	            }
	        });

	        b2.addActionListener(e -> {
	            try {
	                double amount = Double.parseDouble(amountField.getText());
	                bankAccount.withdraw(amount);
	                amountField.setText(""); 
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(frame, "Please enter a valid amount.");
	            }
	        });

	        b3.addActionListener(e -> {
	            double currentBalance = bankAccount.checkBalance();
	            JOptionPane.showMessageDialog(frame, "Current Balance: " + currentBalance);
	        });

		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(img.getImage());
		frame.add(l);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(amountField);
		frame.setVisible(true);
	
	}
	public static void main(String[] args) {
		new ATM_Machine();
	}

}
