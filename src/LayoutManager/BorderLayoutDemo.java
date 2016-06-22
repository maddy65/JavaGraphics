package LayoutManager;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BorderLayoutDemo extends JFrame {

	BorderLayoutDemo(){
		Container c = getContentPane();
		BorderLayout obj = new BorderLayout();
		c.setLayout(obj);
		JButton b1,b2,b3,b4;
		b1 = new JButton("Button1");
		b2 = new JButton("Button3");
		b3 = new JButton("Button3");
		b4 = new JButton("Button4");
		c.add("North", b1);
		c.add("East", b2);
		c.add("South", b3);
		c.add("Center", b4);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BorderLayoutDemo BLD = new BorderLayoutDemo();
		BLD.setTitle("Border Layout");
		BLD.setSize(300,300);
		BLD.setVisible(true);
	}

}
