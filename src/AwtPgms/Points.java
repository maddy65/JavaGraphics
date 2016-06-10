package AWTPgms;
import java.awt.*;
import java.awt.event.*;
public class Points extends Frame{

	/*Points(){
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}*/
	public void paint(Graphics g){
		g.setColor(Color.white);
		for(;;){
			int x = (int) (Math.random() * 800);
			int y = (int) (Math.random() * 600);
			g.drawLine(x, y, x, y);
			try{
				Thread.sleep(20);
			}catch(InterruptedException ie){
				
			}
		}
	}
	public static void main(String[] args) {
		
		Points P1 = new Points();
		P1.setSize(500, 400);
		P1.setBackground(Color.black);
		P1.setTitle("Rando Dots");
		P1.setVisible(true);
	}

}
