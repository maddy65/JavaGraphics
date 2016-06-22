package LayoutManager;
import java.awt.*;
import javax.swing.*;

public class BoxLayoutDemo extends JFrame {
	BoxLayoutDemo(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		MyPanel1 mp1 = new MyPanel1();
		c.add(mp1);
		MyPanel2 mp2 = new MyPanel2();
		c.add(mp2);
	}
	public static void main(String[] args) {
		BoxLayoutDemo Bld = new BoxLayoutDemo();
		Bld.setVisible(true);
		Bld.setSize(600,600);
		Bld.setTitle("Box LayOut Demo");

	}

}
