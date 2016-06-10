package AWTPgms;
import java.awt.*;
import java.awt.event.*;

public class House extends Frame {

	House(){
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g){
		int x[] = {375,275,475};
		int y[] = {125,200,200};
		int n = 3;
		
		this.setBackground(Color.gray);
		g.setColor(Color.yellow);
		g.fillRect(300, 200, 150, 150);
		g.setColor(Color.blue);
		g.drawLine(350, 280, 400, 280);
		g.setColor(Color.darkGray);
		g.setColor(Color.blue);
		g.fillRect(350, 210, 50, 60);
		g.fillPolygon(x, y, 3);
		g.setColor(Color.CYAN);
		g.fillOval(100, 100, 60, 60);
		
		// Green Arc for Grass
		g.setColor(Color.green);
		g.fillArc(50, 250, 150, 100, 0, 180);
		g.fillArc(150, 250, 150, 100, 0, 180);
		g.fillArc(450, 250, 150, 100, 0, 180);
		
		g.drawLine(50, 300, 600, 300);
	}
	public static void main(String[] args) {
		House H1 = new House();
		H1.setSize(500, 400);
		H1.setTitle("House");
		H1.setVisible(true);
	}

}
