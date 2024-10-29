package studentgrade;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
public class NextPage implements ActionListener,KeyListener {
	JFrame frame;
	JTextField[] TF;
	JButton b1,b2,b3;
	JTextField T1,T2;
	JLabel[] L;
	JLabel L1;
	int n;
	float totalmarks,Avg;
	String value;
NextPage(String num,String[] names){
	frame=new JFrame();
	b1=new JButton();
	b2=new JButton();
	b3=new JButton();
	T1=new JTextField();
	T2=new JTextField();
	L1=new JLabel("Enter marks for all subjects");
	try {
		
        n = Integer.parseInt(num); 
        TF = new JTextField[n]; 
        L=new JLabel[n];
    
        for (int i = 0; i < n; i++) { 
        	L[i]=new JLabel(names[i]);
        	L[i].setBounds(50, 30 * i + 50, 100, 30); 
            TF[i] = new JTextField();
            TF[i].setBounds(150, 30 * i + 50, 50, 30); 
            TF[i].addKeyListener(this);
            frame.add(L[i]);
            frame.add(TF[i]);
        }
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(frame, "Please enter a valid number of subjects.");
        return;
    }
	L1.setBounds(50,10,180,30);
	L1.setFont(new Font("Segoe UI",Font.BOLD,14));
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b1.setText("TotalMark");
	b2.setText("Avg Marks");
	b3.setText("Grade");
	b1.setBounds(50, 30 * n + 70, 100, 30);
    b2.setBounds(210, 30 * n + 70, 100, 30);
    b3.setBounds(275, 30 * n + 150, 100, 30);
    T1.setBounds(50, 30 * n + 110, 150, 30);
    T2.setBounds(210, 30 * n + 110, 150, 30);
    T1.setEditable(false);
    T2.setEditable(false);
	frame.setLayout(null);
	frame.setSize(400,400);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.add(L1);
	frame.add(b1);
	frame.add(b2);
	frame.add(b3);
	frame.add(T1);
	frame.add(T2);
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b1) {
		totalmarks=0;
		try {
	for(int i=0;i<n;i++) {
		  
		    value=TF[i].getText();
		    if(Float.parseFloat(value)<1 || Float.parseFloat(value)>100) {
		    	JOptionPane.showMessageDialog(frame, "Enter valid marks!! for subject"+i);
		    	return;
		    }
			totalmarks+=Float.parseFloat(value);
		}
		
	
		T1.setText("TotalMarks: "+totalmarks);
	}
	
	catch(Exception exp) {
		JOptionPane.showMessageDialog( frame,"Please enter valid values!");
	}
	}
	else if(e.getSource()==b2) {
	Avg=totalmarks/n;
	T2.setText("AverageMarks: "+Avg);
	}
	else if(e.getSource()==b3) {
		Grade grade=new Grade(Avg);
	}
}

@Override
public void keyTyped(KeyEvent ke) {
	
}

@Override
public void keyPressed(KeyEvent ke) {
    if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
        ((JTextField) ke.getSource()).transferFocus();
    }
}

@Override
public void keyReleased(KeyEvent e) {
	
}

}

