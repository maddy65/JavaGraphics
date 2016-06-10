package AWTPgms;
import java.awt.*;
import java.awt.event.*;

public class CloseWindAdpExample extends Frame{

	public static void main(String[] args) {
		CloseWindAdpExample f = new CloseWindAdpExample();
		f.setTitle("Close By Window Adapter");
		f.setSize(300, 300);
		f.setVisible(true);
		f.addWindowListener(new WinClass());
	}

}
class WinClass extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
}
