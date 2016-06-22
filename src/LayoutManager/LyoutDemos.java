package LayoutManager;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LyoutDemos extends JFrame implements ActionListener {

	Container c;
	CardLayout card;
	JButton b1;
	LyoutDemos(){
		c = getContentPane();
		card = new CardLayout();
		c.setLayout(card);
		b1 = new JButton("Button");
		c.add("First Card", b1);
		c.add("Second Card", new MyPanel());
		b1.addActionListener(this);
		
	}
	public static void main(String[] args) {
		LyoutDemos Ldm = new LyoutDemos();
		Ldm.setVisible(true);
		Ldm.setSize(300,300);
		Ldm.setTitle("Card ExamplesSS");
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		card.next(c);
	}

}
