package SwingPgms;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KeyBoardEvents extends JFrame implements KeyListener {

	Container c;
	JTextArea ta;
	String str = "";
	KeyBoardEvents() {
		c = getContentPane();
		setLayout(new FlowLayout());
		ta = new JTextArea("Press A key");
		ta.setFont(new Font("Time New Roman",Font.BOLD,30));
		c.add(ta);
		ta.addKeyListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyBoardEvents kbe = new KeyBoardEvents();
		kbe.setSize(300,300);
		kbe.setTitle("Key Board Events");
		kbe.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent ke) {
		// TODO Auto-generated method stub
		int keycode = ke.getKeyCode();
		if(keycode == KeyEvent.VK_F1) str += "F1 key";
		if(keycode == KeyEvent.VK_F2) str += "F2 key";
		if(keycode == KeyEvent.VK_F3) str += "F3 key";
		if(keycode == KeyEvent.VK_PAGE_UP) str += "Page Up key";
		if(keycode == KeyEvent.VK_PAGE_DOWN) str += "Page Down key";
		if(keycode == KeyEvent.VK_ALT) str += "Alter";
		if(keycode == KeyEvent.VK_HOME) str += "Home";
		if(keycode == KeyEvent.VK_END) str += "End";
		ta.setText(str);
		str="";
	}

	@Override
	public void keyReleased(KeyEvent ke) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent ke) {
		// TODO Auto-generated method stub
		
	}

}
