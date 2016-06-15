package SwingPgms;
import javax.swing.*;
import java.awt.*;
public class DisplYColor extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplYColor dc = new DisplYColor();
		Container c = dc.getContentPane();
		c.setBackground(Color.blue);
		dc.setSize(400,400);
		dc.setTitle("Displaying Color");
		dc.setVisible(true);
		dc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
