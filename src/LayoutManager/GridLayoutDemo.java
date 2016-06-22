package LayoutManager;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GridLayoutDemo extends JFrame {
	GridLayoutDemo(){
		Container c = getContentPane();
		GridLayout grid = new GridLayout();
		c.setLayout(grid);
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		JButton b3 = new JButton("Button 3");
		JButton b4 = new JButton("Button 4");
		JButton b5 = new JButton("Button 5");
		
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
	}

	public static void main(String[] args) {
		GridLayoutDemo Gld = new GridLayoutDemo();
		Gld.setVisible(true);
		Gld.setSize(600,600);
		Gld.setTitle("Grid Layout Example");
	}

}
