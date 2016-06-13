package AWTPgms;
import java.awt.*;
import java.awt.event.*;

 class myCheckBox extends Frame implements ItemListener{

	 String msg = "";
	 Checkbox c1,c2,c3;
	 myCheckBox(){
		 setLayout(new FlowLayout());
		 c1 = new Checkbox("Bold",true);
		 c2 = new Checkbox("Italic");
		 c3 = new Checkbox("Underline");
		 
		 add(c1);
		 add(c2);
		 add(c3);
		 
		 c1.addItemListener(this);
		 c2.addItemListener(this);
		 c3.addItemListener(this);
		 
		 addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		 });
	 }
	public static void main(String[] args) {
		myCheckBox M1 = new myCheckBox();
		M1.setTitle("My Checkbox");
		M1.setSize(400,400);
		M1.setVisible(true);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		repaint();
	}
	public void paint(Graphics g){
		g.drawString("Current Status", 10, 100);
		msg = "Bold: "+c1.getState();
		g.drawString(msg, 10, 120);
		msg = "Italic: "+c2.getState();
		g.drawString(msg, 10, 140);
		msg = "Underline: "+c3.getState();
		g.drawString(msg, 10, 160);
	}

}
