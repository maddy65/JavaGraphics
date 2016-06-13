package AWTPgms;
import java.awt.*;
import java.awt.event.*;

class MyButtons extends Frame implements ActionListener {

	Button b1,b2,b3;
	MyButtons(){
		this.setLayout(null);
		b1 = new Button("yellow");
		b2 = new Button("Red");
		b3 = new Button("Green");
		b1.setBounds(100,100,70,40);
		b2.setBounds(100,160,70,40);
		b3.setBounds(100,220,70,40);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	// This method is called when button is cliscked
	
	public void actionPerformed(ActionEvent ae){
		String str = ae.getActionCommand();
		if(str.equals("yellow")) this.setBackground(Color.yellow);
		if(str.equals("Red")) this.setBackground(Color.red);
		if(str.equals("Green")) this.setBackground(Color.green);
	}
	public static void main(String[] args) {
		
		MyButtons mb = new MyButtons();
		mb.setSize(400,400);
		mb.setTitle("My Buttons");
		mb.setVisible(true);
	}

}
