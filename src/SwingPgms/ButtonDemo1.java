package SwingPgms;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.*;
import javax.swing.*;
import javax.swing.border.*;

public class ButtonDemo1 extends JFrame implements ActionListener{
	JButton b;
	JLabel l;
	ButtonDemo1(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon ii = new ImageIcon("Car.gif");
		b = new JButton("Click me",ii);
		b.setBackground(Color.red);
		b.setForeground(Color.black);
		b.setFont(new Font("Arial", Font.BOLD,30));
		Border bd = BorderFactory.createBevelBorder(BevelBorder.RAISED);
		b.setBorder(bd);
		b.setToolTipText("Click ME");
		l = new JLabel();
		c.add(l);
		c.add(b);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		ButtonDemo1 BD = new ButtonDemo1();
		BD.setSize(900,900);
		BD.setTitle("Hello");
		BD.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		ImageIcon ii = new ImageIcon("car.gif");
		l.setIcon(ii);
		
	}

}
