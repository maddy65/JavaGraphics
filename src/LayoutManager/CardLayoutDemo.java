package LayoutManager;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutDemo extends JFrame implements ActionListener {
	Container c;
	CardLayout card;
	JButton b1,b2,b3,b4;
	CardLayoutDemo(){
		c = getContentPane();
		card = new CardLayout(50,10);
		c.setLayout(card);
		
		b1 = new JButton("Button1");
		b2 = new JButton("Button3");
		b3 = new JButton("Button3");
		b4 = new JButton("Button4");
		
		c.add("First Card", b1);
		c.add("Second Card", b2);
		c.add("Third Card", b3);
		c.add("Fourth Card", b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardLayoutDemo CLD = new CardLayoutDemo();
		CLD.setSize(300,300);
		CLD.setTitle("Card Layout");
		CLD.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		card.next(c);
	}

}
