package LayoutManager;
import java.awt.*;
import javax.swing.*;

public class FlowLayoutDemo extends JFrame {
	
	FlowLayoutDemo(){
		Container c = getContentPane();
		FlowLayout obj = new FlowLayout(FlowLayout.RIGHT,10,10);
		c.setLayout(obj);
		JButton b1,b2,b3,b4;
		b1 = new JButton("Button 1");
		b2 = new JButton("Button 2");
		b3 = new JButton("Button 3");
		b4 = new JButton("Button 4");
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowLayoutDemo FLD = new FlowLayoutDemo();
		FLD.setSize(300,300);
		FLD.setVisible(true);
		FLD.setTitle("Flow Layout Demo");
	}

}
