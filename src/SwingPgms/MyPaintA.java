package SwingPgms;
import javax.swing.*;
import java.awt.*;

public class MyPaintA extends JFrame{
		MyPaintA(){
			Container c = this.getContentPane();
			MyPaintB  mp = new MyPaintB();
			c.add(mp);
		}
	
	public static void main(String[] args) {
		MyPaintA MP = new MyPaintA();
		MP.setSize(400,400);
		MP.setTitle("Displaying Text");
		MP.setVisible(true);
		MP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
