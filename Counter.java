package Lab;

import java.awt.event.ActionEvent;

import javax.swing.*;

public class Counter {
	JLabel l1;
	JButton b1,b2,b3;
	JTextField t1;
	Counter(){
		JFrame j=new JFrame("AWT Counter");
		JPanel p=new JPanel();
		l1=new JLabel("counter");
		t1=new JTextField("0              0");
		b1=new JButton("count up");
		b2=new JButton("count down");
		b3=new JButton("reset");
		p.add(l1);
		p.add(t1);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		j.add(p);
		j.setSize(400,400);
		j.setContentPane(p);
		j.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b2) {
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Counter();
	}

}
