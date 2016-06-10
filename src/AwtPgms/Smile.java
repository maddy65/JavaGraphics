package AWTPgms;
import java.awt.*;
import java.awt.event.*;

public class Smile extends Frame{
	
	Smile(){
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.drawRect(40,40, 200, 200);
		g.drawOval(90,70,80,80);
		g.drawOval(110,95,5,5);
		g.drawOval(140,95,5,5);
		g.drawLine(130, 95, 130, 115);
		g.drawArc(113, 115, 35, 20, 0, -180);
	}

	public static void main(String[] args) {
		
		Smile f = new Smile();
		f.setSize(400,400);
		f.setTitle("SmileFace");
		f.setVisible(true);
	}

}
