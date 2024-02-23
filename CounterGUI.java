package Lab;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CounterGUI implements ActionListener{
JButton up,down,reset;
JTextField t;
CounterGUI(){
JFrame f = new JFrame("COUNTER");
JPanel p=new JPanel();
p.setLayout(new GridLayout(4,1));
JButton up = new JButton("UP");
JButton down = new JButton("DOWN");
JButton reset = new JButton("RESET");
JTextField t = new JTextField("0");

p.add(up);
p.add(t);
p.add(down);
p.add(reset);
f.add(p);
f.setSize(250,250);
f.setVisible(true);
up.addActionListener(this);
down.addActionListener(this);
reset.addActionListener(this);
}


public void actionPerformed(ActionEvent e) {
if(e.getSource()==reset) {
t.setText(null);
}
if(e.getSource()==up) {
int num=Integer.parseInt(t.getText());
num++;
t.setText(Integer.toString(num));
}
if(e.getSource()==down) {
int num=Integer.parseInt(t.getText());
num--;
t.setText(Integer.toString(num));
}
}


public static void main(String[] args) {

new CounterGUI();
}
}