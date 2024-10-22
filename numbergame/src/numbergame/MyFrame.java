package numbergame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	JButton btn1;
	JLabel label;
	MyFrame(){
		 	 
		ImageIcon  img=new ImageIcon(getClass().getResource("/numberIcon.png"));
		btn1=new JButton();
		label=new JLabel();
		label.setText("Welcome To Number Game");
		label.setFont(new Font("Ariel",Font.PLAIN,24));
		label.setBounds(125, 150, 300, 100);//175 150 155 100
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setOpaque(true);
		btn1.setBounds(200,250,100,50);
		btn1.setText("START");
		btn1.addActionListener(this);
		this.setTitle("Number Game");
		this.setIconImage(img.getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(label);
		this.add(btn1);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==btn1) {
		window w=new window();
	
	}
	
	}
}
