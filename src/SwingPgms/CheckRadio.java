package SwingPgms;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CheckRadio extends JFrame implements ActionListener{
	JRadioButton jr;
	JCheckBox cb1,cb2;
	JRadioButton rb1,rb2;
	JTextArea Ja;
	JTextField jf;
	ButtonGroup bg;
	String msg = "";
	CheckRadio(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		Ja = new JTextArea(10,20);
		cb1 = new JCheckBox("Java",true);
		cb2 = new JCheckBox("J2EE");
		rb1 = new JRadioButton("Male",true);
		rb2 = new JRadioButton("Famale");
		bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		c.add(cb1);
		c.add(cb2);
		c.add(rb1);
		c.add(rb2);
		c.add(Ja);
		cb1.addActionListener(this);
		cb2.addActionListener(this);
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		CheckRadio CR = new CheckRadio();
		CR.setTitle("JComponent");
		CR.setSize(600,600);
		CR.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(cb1.getModel().isSelected()) msg += "\nJava";
		if(cb2.getModel().isSelected()) msg += "\nJ2EE";
		if(rb2.getModel().isSelected()) msg += "\nMale";
		else msg += "\nFemale";
		Ja.setText(msg);
		msg = "";
	}

}
