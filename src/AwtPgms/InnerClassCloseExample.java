package AWTPgms;
import java.awt.*;
import java.awt.event.*;
 class InnerClassCloseExample extends Frame{

	public static void main(String[] args) {
		InnerClassCloseExample f = new InnerClassCloseExample();
		f.setSize(300,300);
		f.setVisible(true);
		f.setTitle("Anonymous");
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});

	}

}
