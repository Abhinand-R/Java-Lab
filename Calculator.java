package Lab;

import java.awt.event.*;

import javax.swing.*;
public class Calculator implements ActionListener{

int op,n,a,b;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
JTextField t1;
JFrame f;
JPanel p;
Calculator(){  
f= new JFrame("Calculator");
p=new JPanel();

t1= new JTextField(30);
t1.setBounds(100,100 , 200, 30);

b1= new JButton("1");
b1.setBounds(100,140,50,30);

b2= new JButton("2");
b2.setBounds(150,140,50,30);
b3= new JButton("3");
b3.setBounds(200,140,50,30);
b4= new JButton("+");
b4.setBounds(250,140,50,30);
b5 = new JButton("4");
b5.setBounds(100,180,50,30);
b6 = new JButton("5");
b6.setBounds(150,180,50,30);
b7 = new JButton("6");
b7.setBounds(200,180,50,30);
b8 = new JButton("-");
b8.setBounds(250,180,50,30);
b9 = new JButton("7");
b9.setBounds(100,220,50,30);
b10 = new JButton("8");
b10.setBounds(150,220,50,30);
b11= new JButton("9");
b11.setBounds(200,220,50,30);
b12= new JButton("*");
b12.setBounds(250,220,50,30);
b13 = new JButton("/");
b13.setBounds(100,260,50,30);
b14 = new JButton("0");
b14.setBounds(150,260,50,30);
b15= new JButton("=");
b15.setBounds(200,260,50,30);
b16= new JButton("C");
b16.setBounds(250,260,50,30);
   
p.add(b1);
p.add(b2);
p.add(b3);
p.add(b4);
p.add(t1);
p.add(b5);
p.add(b6);
p.add(b7);
p.add(b8);
p.add(b9);
p.add(b10);
p.add(b11);
p.add(b12);
p.add(b13);
p.add(b14);
p.add(b15);
p.add(b16);
f.setContentPane(p);
f.setLayout(null);
f.setSize(450,400);
f.setVisible(true);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);


}
    public void actionPerformed(ActionEvent e) {
   
    if(e.getSource()==b1)
    t1.setText(t1.getText()+"1");
    else if(e.getSource()==b2)
    t1.setText(t1.getText()+"2");
    else if(e.getSource()==b3)
    t1.setText(t1.getText()+"3");
    else if(e.getSource()==b5)
    t1.setText(t1.getText()+"4");
    else if(e.getSource()==b6)
    t1.setText(t1.getText()+"5");
    else if(e.getSource()==b7)
    t1.setText(t1.getText()+"6");
    else if(e.getSource()==b9)
    t1.setText(t1.getText()+"7");
    else if(e.getSource()==b10)
    t1.setText(t1.getText()+"8");
    else if(e.getSource()==b11)
    t1.setText(t1.getText()+"9");
    else if(e.getSource()==b14)  
    t1.setText(t1.getText()+"0");    
   else if(e.getSource()==b4)
            {
           a=Integer.parseInt(t1.getText());
           t1.setText("");
           op=1;
           }
           else if(e.getSource()==b8)
            {
           a=Integer.parseInt(t1.getText());
           t1.setText("");
           op=2;
           }
            else if(e.getSource()==b12)
            {
           a=Integer.parseInt(t1.getText());
           t1.setText("");
           op=3;
           }
            else if(e.getSource()==b13)
            {
           a=Integer.parseInt(t1.getText());
           t1.setText("");
           op=4;
           }
            else if(e.getSource()==b15) {
            b=Integer.parseInt(t1.getText());
           calc(a,op,b);
            }
       else {
       t1.setText("");
       }
       }
    void calc(int a,int op,int b) {
    int res;
    switch(op) {
    case 1 : res=a+b;
    t1.setText("");
    t1.setText(Integer.toString(res));
    break;
    case 2 : res=a-b;
    t1.setText("");
    t1.setText(Integer.toString(res));
    break;
    case 3 : res=a*b;
    t1.setText("");
    t1.setText(Integer.toString(res));
    break;
    case 4 : try{
    res=a/b;
    t1.setText("");
    t1.setText(Integer.toString(res));
    }
    catch(ArithmeticException e) {
   
    }
    break;
    default:
    break;
    }
    }
   
   
public static void main(String[] args) {
new Calculator();

}

}
