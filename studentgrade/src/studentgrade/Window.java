package studentgrade;


import java.awt.event.*;

import javax.swing.*;

public class Window implements ActionListener,KeyListener {
	JFrame f;
	JLabel l;
	JTextField T;
	JButton btn;
	String value;
	Window(){
		f=new JFrame("Student Grade Calculator");
		l=new JLabel();
		T=new JTextField();
		btn=new JButton();
		btn.setText("Enter");
		btn.setBounds(200,200,75,25);
		btn.addActionListener(e->{
			if(e.getSource()==btn) {
				value=T.getText();	
				if(value!="") {
				 SubjectName subname=new SubjectName(value);
				}
				else {
					JOptionPane.showMessageDialog(f,"Enter the subject names");
				}

			}
		});
		l.setBounds(125,100,200,30);
		l.setText("Enter number of subject");
		l.setLayout(null);
		T.setBounds(125,150,150,30);
		T.addKeyListener(this);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(l);
		f.add(T);
		f.add(btn);
	}
	 @Override
	    public void keyPressed(KeyEvent ke) {
	        if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
	            value = T.getText();
	            SubjectName subname=new SubjectName(value);
	        }
	    }
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

