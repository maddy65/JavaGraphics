package AWTPgms;
import java.awt.*;
import java.awt.event.*;

public class MyChoice extends Frame implements ItemListener{
	
	String msg = "";
	Choice ch;
	MyChoice(){
		setLayout(new FlowLayout());
		ch = new Choice();
		ch.add("Hydrabad");
		ch.add("Delhi");
		ch.add("USA");
		ch.add("United Kingdom");
		ch.add("Spain");
		
		add(ch);
		ch.addItemListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		MyChoice mc = new MyChoice();
		mc.setSize(300,300);
		mc.setTitle("Choice");
		mc.setVisible(true);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		repaint();
		
	}
	public void paint(Graphics g){
		g.drawString("Selected Item: ",10,100);
		msg = ch.getSelectedItem();
		g.drawString(msg, 10, 120);
	}

}
