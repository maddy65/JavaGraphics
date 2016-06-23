package Applets;
import java.applet.*;
import java.awt.*;

public class HelloApplets extends Applet {
	public void init(){
		setBackground(Color.yellow);
	}
	public void paint(Graphics g){
		g.drawString("Hello Applets", 50, 100);
	}
}
