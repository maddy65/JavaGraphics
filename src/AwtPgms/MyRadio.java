package AWTPgms;
import java.awt.*;
import java.awt.event.*;

public class MyRadio extends Frame implements ItemListener{
	String msg = "";
	CheckboxGroup  cbg;
	Checkbox y,n;
	MyRadio(){
		setLayout(new FlowLayout());
		cbg = new CheckboxGroup();
		y = new Checkbox("Yes",cbg,true);
		n = new Checkbox("No",cbg,false);
		add(y);
		add(n);
		y.addItemListener(this);
		n.addItemListener(this);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRadio Mr = new MyRadio();
		Mr.setTitle("RadioExample");
		Mr.setSize(400,400);
		Mr.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}
	public void paint(Graphics g){
		msg = "Current Selection: ";
		msg+= cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg, 10, 100);
		
	}
}
