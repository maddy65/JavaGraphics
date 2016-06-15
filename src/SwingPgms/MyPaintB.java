package SwingPgms;
import javax.swing.*;
import java.awt.*;

public class MyPaintB extends JPanel {
	MyPaintB(){
		this.setBackground(Color.green);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.red);
		g.setFont(new Font ("Arial",Font.BOLD,34));
		g.drawString("Hello", 50, 100);
	}
}
