package AWTPgms;
import java.awt.*;
import java.awt.event.*;

public class Frame2 extends Frame implements ActionListener{
	Button b;
	Frame2(){
		setLayout(new FlowLayout());
		b = new Button("Back");
		add(b);
		b.addActionListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame2 F1 = new Frame2();
		F1.setSize(400,400);
		F1.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		this.dispose();
	}

}
