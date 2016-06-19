package SwingPgms;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JSplitPaneDemo extends JFrame implements ActionListener {

	String str = "This is my text";
	JButton b;
	JTextArea ja;
	JSplitPane sp;
	JSplitPaneDemo(){
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		b = new JButton("My Button");
		ja = new JTextArea();
		ja.setLineWrap(true);
		sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,b,ja);
		sp.setDividerLocation(300);
		c.add("Center", sp);
		
		b.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSplitPaneDemo spd = new JSplitPaneDemo();
		spd.setSize(400,400);
		spd.setTitle("SplitPane");
		spd.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		ja.setText(str);
	}

}
