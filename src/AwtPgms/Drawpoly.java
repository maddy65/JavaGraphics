package AWTPgms;
import java.awt.*;
import java.awt.event.*;

public class Drawpoly extends Frame {
	Drawpoly(){
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g){
		g.setColor(Color.red);
		g.fillRoundRect(30, 30, 250, 250, 30, 30);
		g.setColor(Color.green);
		int x[] = {40,200,40,100};
		int y[] = {40,40,200,200};
		int num = 4;
		g.fillPolygon(x, y, num);
	}
	public static void main(String[] args) {
		Drawpoly Dp = new Drawpoly();
		Dp.setSize(400,400);
		Dp.setTitle("Polygon");
		Dp.setVisible(true);
		}

}
