package AWTPgms;
import java.awt.*;
import java.awt.event.*;

 class Layouts extends Frame implements ActionListener {

	 Button b1,b2,b3;
	 Layouts(){
		setLayout(new FlowLayout());
		b1 = new Button("Red");
		b2 = new Button("Blue");
		b3 = new Button("Green");
		
		add(b1);
		add(b2);
		add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	 }
	
	public void actionPerformed(ActionEvent ae){
		
		if(ae.getSource() == b1) setBackground(Color.red);
		if(ae.getSource() == b2) setBackground(Color.blue);
		if(ae.getSource() == b3) setBackground(Color.green);
		
	}
	 
	public static void main(String[] args) {
		Layouts L1 = new Layouts();
		L1.setSize(300,300);
		L1.setVisible(true);
	}
 }
	
	