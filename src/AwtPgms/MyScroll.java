package AWTPgms;
import java.awt.*;
import java.awt.event.*;

public class MyScroll extends Frame implements AdjustmentListener{
	
	String msg ="";
	Scrollbar sb;
	MyScroll(){
		setLayout(new FlowLayout());
		sb = new Scrollbar(Scrollbar.VERTICAL,0,30,0,400);
		sb.setBounds(250,50,30,200);
		add(sb);
		sb.addAdjustmentListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		MyScroll MS = new MyScroll();
		MS.setSize(400,400);
		MS.setTitle("ScrollBar");
		MS.setVisible(true);
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}
	public void paint(Graphics g){
		g.drawString("Scrollbar Position: ", 20, 150);
		msg += sb.getValue();
		g.drawString(msg, 20, 180);
		msg="";
	}

}
