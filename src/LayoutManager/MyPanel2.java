package LayoutManager;
import java.awt.*;
import javax.swing.*;
public class MyPanel2 extends JPanel{
	MyPanel2(){
		
		BoxLayout Box2 = new BoxLayout(this,BoxLayout.Y_AXIS);
		setLayout(Box2);
		JButton b1,b2,b3;
		b1 = new JButton("Button1");
		b2 = new JButton("Button2");
		b3 = new JButton("Button3");
		add(b1);
		add(b2);
		add(b3);
	}
}
