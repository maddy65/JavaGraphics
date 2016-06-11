package AWTPgms;
import java.awt.*;
import java.awt.event.*;

public class Images extends Frame {
	static Image Img;
	Images(){
		Img = Toolkit.getDefaultToolkit().getImage("abc.JPG");
		MediaTracker track = new MediaTracker(this);
		track.addImage(Img, 0);
		try{
			track.waitForID(0);
		}catch(InterruptedException ie){
			
		}
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g){
		g.drawImage(Img, 50, 50, null);
	}
	public static void main(String[] args) {
		Images i = new Images();
		i.setSize(300,300);
		i.setVisible(true);
	}

}
