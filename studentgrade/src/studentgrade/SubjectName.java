package studentgrade;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SubjectName  implements ActionListener,KeyListener{
	Window wdw=new Window();
	JFrame f;
	int n;
	JTextField[] t;
	JLabel[] l;
	JButton btn;
	String[] subject;
SubjectName(String num){
	n=Integer.parseInt(num);
	f=new JFrame();
	l=new JLabel[n];
	t=new JTextField[n];
	btn=new JButton();
	subject=new String[n];
	for(int i=0;i<n;i++) {
		 l[i]=new JLabel("Name of Subject "+(i+1)+":");
		 l[i].setBounds(30,30*i+50,125,30);
		 t[i]=new JTextField();
		 t[i].setBounds(150,30*i+50,100,30);
		 t[i].addKeyListener(this);
		 
		 f.add(l[i]);
		 f.add(t[i]);
	 }
	btn.setText("Next");
	btn.setBounds(50,30*n+80,100,20);
	btn.addActionListener(e->{
		for (int i = 0; i < n; i++) {
            subject[i] = t[i].getText(); 
        }
		NextPage nextpage=new NextPage(num,subject);
	});
	
	 f.add(btn);
	 f.setSize(400,400);
	 f.setLayout(null);
	 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 f.setVisible(true);
}

@Override
public void keyTyped(KeyEvent e) {
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

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}




