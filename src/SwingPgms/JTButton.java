package SwingPgms;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTButton extends JFrame implements ActionListener{

	JToggleButton but;
	ImageIcon Img1;
	JTButton(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		Img1 = new ImageIcon("Image1.png");
		but = new JToggleButton("Start/Strop",Img1);
		c.add(but);
		but.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JTButton Jtb = new JTButton();
		Jtb.setSize(300,300);
		Jtb.setTitle("Toggeled Button");
		Jtb.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		ImageIcon img2 = new ImageIcon("Image2.png");
		if(but.isSelected())
			but.setIcon(img2);
		else
			but.setIcon(Img1);
	}

}
