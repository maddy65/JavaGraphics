package AWTPgms;
import java.awt.*;
import java.awt.event.*;
public class displayText extends Frame {

	displayText(){
		this.addWindowListener(new WindowAdapter(){
			public  void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g){
		this.setBackground(new Color(100,20,20));
		Font f = new Font("Arial", Font.BOLD+Font.ITALIC,30);
		g.setFont(f);
		g.setColor(Color.green);
		g.drawString("Hello",110, 110);
	}
	public static void main(String[] args) {
		displayText dt = new displayText();
		dt.setSize(300,300);
		dt.setVisible(true);

	}

}
