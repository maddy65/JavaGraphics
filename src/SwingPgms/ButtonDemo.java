package SwingPgms;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ButtonDemo extends JFrame {
	JButton b;
	ButtonDemo(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon ii = new ImageIcon("car.gif");
		b = new JButton("Click me",ii);
		b.setBackground(Color.yellow);
		b.setBackground(Color.red);
		b.setFont(new Font("Arial",Font.BOLD,30));
		Border bd = BorderFactory.createBevelBorder(BevelBorder.RAISED);
		b.setBorder(bd);
		b.setToolTipText("Click me");
		b.setMnemonic('C');
		c.add(b);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		ButtonDemo BD = new ButtonDemo();
		BD.setTitle("ButtonDemo");
		BD.setSize(600,600);
		BD.setVisible(true);

	}

}
