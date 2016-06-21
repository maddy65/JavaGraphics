package SwingPgms;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEvents extends JFrame implements MouseListener {
		Container c;
		JTextArea ja;
		int x,y;
		String str ="";
	 MouseEvents() {
		// TODO Auto-generated constructor stub
		 c = getContentPane();
		 setLayout(new FlowLayout());
		 ja = new JTextArea("Click the mouse move over it",5,50);
		 ja.setFont(new Font("Arial",Font.BOLD,30));
		 c.add(ja);
		 ja.addMouseListener(this);
		//ja.addMouseMotionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseEvents mbe = new MouseEvents();
		mbe.setSize(300,300);
		mbe.setTitle("Key Board Events");
		mbe.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		// TODO Auto-generated method stub
		int i = me.getButton();
		if(i==1)
			str += "Clicked Button : LEFT";
		if(i==2)
			str += "Clicked Button : Middle";
		if(i==3)
			str += "Clicked Button : Right";
		this.display();
	}

	private void display() {
		ja.setText(str);
		str = "";
		
	}

	@Override
	public void mouseEntered(MouseEvent me) {
		// TODO Auto-generated method stub
		str += "Mouse Entered";
				this.display();
	}

	@Override
	public void mouseExited(MouseEvent me) {
		// TODO Auto-generated method stub
		str += "Mouse exit";
		this.display();
	}

	@Override
	public void mousePressed(MouseEvent me) {
		// TODO Auto-generated method stub
		int x = me.getX();
		int y = me.getY();
		str += "Mouse Pressed at :"+x+"\t"+y;
		this.display();
	}

	@Override
	public void mouseReleased(MouseEvent me) {
		// TODO Auto-generated method stub
		int x = me.getX();
		int y = me.getY();
		str += "Mouse Released at :"+x+"\t"+y;
		this.display();
		
	}

}
