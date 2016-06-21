package SwingPgms;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ProgressDemo extends JFrame implements ActionListener {

	JButton b;
	JProgressBar bar;
	ProgressDemo(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		b = new JButton("Click repeatdly");
		bar = new JProgressBar();
		bar.setForeground(Color.gray);
		bar.setStringPainted(true);
		c.add(b);
		c.add(bar);
		b.addActionListener(this);
	}
	public static void main(String[] args) {
		ProgressDemo Jbar = new ProgressDemo();
		Jbar.setSize(300,300);
		Jbar.setTitle("Progress Bar");
		Jbar.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		bar.setValue(bar.getValue()+5);
	}

}
