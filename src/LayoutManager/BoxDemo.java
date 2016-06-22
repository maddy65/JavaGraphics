package LayoutManager;
import java.awt.*;
import javax.swing.*;

public class BoxDemo extends JFrame{
	BoxDemo(){
		JLabel nam = new JLabel("Enter Name");
		JTextField t1 = new JTextField(20);
		t1.setMaximumSize(t1.getPreferredSize());
		
		Box horizl = Box.createHorizontalBox();
		horizl.add(nam);
		horizl.add(Box.createHorizontalStrut(20));
		horizl.add(t1);
		
		JLabel pwd = new JLabel("Enter Password");
		JTextField t2 = new JTextField(20);
		t1.setMaximumSize(t2.getPreferredSize());
		
		Box horizl2 = Box.createHorizontalBox();
		horizl2.add(pwd);
		horizl2.add(Box.createHorizontalStrut(20));
		horizl2.add(t2);
		JButton b1 = new JButton("Ok");
		JButton b2 = new JButton("Cancel");
		
		Box horizl3 = Box.createHorizontalBox();
		horizl3.add(b1);
		horizl3.add(Box.createHorizontalGlue());
		horizl3.add(b2);
		
		Box vert = Box.createVerticalBox();
		vert.add(horizl);
		vert.add(Box.createVerticalStrut(100));
		vert.add(horizl2);
		vert.add(Box.createVerticalStrut(100));
		vert.add(horizl3);
		Container c = getContentPane();
		c.add(vert);
	}
	public static void main(String[] args) {
		BoxDemo Bd = new BoxDemo();
		Bd.setVisible(true);
		Bd.setSize(400,350);
		Bd.setTitle("BoxDemo");

	}

}
