package AWTPgms;
import java.awt.*;
import java.awt.event.*;

public class CloseExample extends Frame {

	public static void main(String[] args) {
		
		CloseExample f = new CloseExample();
		f.setTitle("Close Example");
		f.setSize(500,500);
		f.setVisible(true);
		f.addWindowListener(new myclass());
	}
}

class myclass implements WindowListener{
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}

