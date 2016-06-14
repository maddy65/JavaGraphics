package AWTPgms;
import java.awt.*;
import java.awt.event.*;

public class Keys extends Frame implements KeyListener{
	TextArea ta;
	String msg = "";
	Keys(){
		setLayout(new FlowLayout());
		ta = new TextArea(5,25);
		Font f = new Font("SansSerif",Font.BOLD,25);
		ta.setFont(f);
		ta.setForeground(Color.red);
		add(ta);
		ta.addKeyListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		Keys K = new Keys();
		K.setSize(500,500);
		K.setTitle("Keys");
		K.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent ke) {
		// TODO Auto-generated method stub
		// code of key pressed
		int keycode = ke.getKeyCode();
		msg += "\nKey code: "+keycode;
		
		// name of the key from the code
		String name = ke.getKeyText(keycode);
		msg += "\nKey pressed: "+name;
		
		// display the key code and name
		ta.setText(msg);
		msg="";
	}

	@Override
	public void keyReleased(KeyEvent ke) {
		// TODO Auto-generated method stub
		int keycode = ke.getKeyCode();
		msg += "\nKey code :"+keycode;
		
		String name = ke.getKeyText(keycode);
		msg += "\nKey name :"+name;
		ta.setText(msg);
		msg="";
	}

	@Override
	public void keyTyped(KeyEvent ke) {
		// TODO Auto-generated method stub
		
	}

}
