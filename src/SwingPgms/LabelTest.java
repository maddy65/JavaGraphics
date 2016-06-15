package SwingPgms;
import javax.swing.*;
import java.awt.*;
public class LabelTest extends JFrame {
	JLabel lbl;
	LabelTest(){
		Container c = this.getContentPane();
		c.setBackground(Color.red);
		c.setLayout(new FlowLayout());
		lbl = new JLabel("Hello");
		lbl.setFont(new Font("Helvetica",Font.BOLD,50));
		lbl.setForeground(Color.black);
		c.add(lbl);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LabelTest LT = new LabelTest();
		LT.setTitle("DisplayText");
		LT.setSize(400,400);
		LT.setVisible(true);
	}

}
