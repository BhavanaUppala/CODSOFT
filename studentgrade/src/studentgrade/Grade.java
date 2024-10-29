package studentgrade;


import java.awt.Font;

import javax.swing.*;

public class Grade{ 
	JFrame f;
	JTextField t;
	JLabel l;
	JTable table;
	JScrollPane scrollpane;
	String[] columns= {"marks","grade"};
	Object[][] data= {{"91-100",'A'},
			{"81-90",'B'},{"71-80",'C'},{"61-70",'D'},{"51-60",'E'},{"<=50",'F'}};
			
public Grade(float float1) {
	// TODO Auto-generated constructor stub
	f=new JFrame("Grade");
	t=new JTextField();
	l=new JLabel();
	l.setText("Grade");
	table=new JTable(data,columns);
	scrollpane=new JScrollPane(table);
	 l.setBounds(100, 50, 50, 30);   
	 l.setFont(new Font("Ariel",Font.BOLD,16));
     t.setBounds(150, 50, 50, 30); 
     scrollpane.setBounds(100, 150, 200, 125);
     if(float1 > 90 && float1 <= 100) {
    	    t.setText("A");
    	} else if(float1 > 80 && float1 <= 90) {
    	    t.setText("B");
    	} else if(float1 > 70 && float1 <= 80) {
    	    t.setText("C");
    	} else if(float1 > 60 && float1 <= 70) {
    	    t.setText("D");
    	} else if(float1 > 50 && float1 <= 60) {
    	    t.setText("E");
    	} else {
    	    t.setText("F");
    	}
     t.setFont(new Font("Ariel",Font.BOLD,12));
     t.setEditable(false);
	
	f.setSize(400,400);
	f.setLayout(null);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.add(l);
	f.add(t);
	f.add(scrollpane);
	f.setVisible(true);
}
}

