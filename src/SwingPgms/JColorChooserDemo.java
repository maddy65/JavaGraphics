package SwingPgms;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JColorChooserDemo extends JFrame implements ActionListener {
	JButton b;
	Container c;
	JColorChooserDemo(){
		c = getContentPane();
		setLayout(new FlowLayout());
		b = new JButton("Select a color");
		c.add(b);
		b.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JColorChooserDemo JCCB = new JColorChooserDemo();
		JCCB.setSize(300,300);
		JCCB.setTitle("Color");
		JCCB.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		Color selectcolor = null;
		Color color = JColorChooser.showDialog(this, "Select a color", selectcolor);
		if(color != null){
			selectcolor = color;
		}
		c.setBackground(color);
		
	}

}
