import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class task2 extends JFrame implements ActionListener
{
public JFrame f;
public JLabel l;
public JLabel l1;
public JLabel l2;
public JTextField tf;
public JButton b1;
public JButton b2;
public JButton b3;
task2()
{
f=new JFrame("word counter");
l=new JLabel();
l1=new JLabel();
l2=new JLabel();
tf=new JTextField();
b1=new JButton("character count");
b2=new JButton("word count");
b3=new JButton("character and word count");
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
l.setBounds(500,500,200,200);
l.setFont(new Font("times new roman",Font.BOLD,20));
l.setText("enter string");
l.setForeground(Color.black);
l.setBackground(Color.yellow);
l.setOpaque(true);  
l1.setForeground(Color.white);
l2.setForeground(Color.white);
l1.setFont(new Font("times new roman",Font.BOLD,15));
l2.setFont(new Font("times new roman",Font.BOLD,15));
tf.setPreferredSize(new Dimension(200,50));
f.add(l);
f.add(tf);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(l1);
f.add(l2);
f.setPreferredSize(new Dimension(420,420));
f.pack();
f.getContentPane().setBackground(Color.blue);
f.setLayout(new FlowLayout());
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
f.setResizable(false);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
String text=tf.getText();
l1.setText("characters are: " +text.length());
}
else if(e.getSource()==b2)
{
String text=tf.getText();
String word[]=text.split(" ");
l2.setText("words are: " +word.length);
}
else if(e.getSource()==b3)
{
String text=tf.getText();
String word[]=text.split(" ");
l1.setText("characters are: " +text.length());
l2.setText("words are: " +word.length);
}
}
public static void main(String [] args)
{
new task2();
}
}