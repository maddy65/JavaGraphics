package SwingPgms;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JToolBarDemo extends JFrame implements ActionListener {
	String str;
	Container c;
	JToolBar tb;
	JButton b1,b2,b3;
	JLabel lbl;
	JToolBarDemo(){
		c = getContentPane();
		setLayout(new FlowLayout());
		tb = new JToolBar();
		b1 = new JButton("Open");
		b2 = new JButton("Close");
		b3 = new JButton("Save");
		tb.add(b1);
		tb.add(b2);
		tb.add(b3);
		c.add("North",tb);
		lbl = new JLabel();
		lbl.setFont(new Font("SansSerif",Font.PLAIN,30));
		c.add("Center", lbl);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JToolBarDemo JTbar = new JToolBarDemo();
		JTbar.setSize(300,300);
		JTbar.setTitle("Progress Bar");
		JTbar.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource() == b1) str = "Open Clicked";
		if(ae.getSource() == b2) str = "Close Clicked";
		if(ae.getSource() == b3) str = "Save Clicked";
		lbl.setText(str);
	}

}
