package LayoutManager;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyPanel extends JPanel {

	JTextField tf;
	JCheckBox jcb;
	JButton tb;
	MyPanel(){
		this.setLayout(new BorderLayout());
		tf = new JTextField();
		jcb = new JCheckBox();
		tb = new JButton();
		this.add("North",tf);
		this.add("South", jcb);
		this.add("East",tb);
	}
	

}
