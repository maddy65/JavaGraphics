package AWTPgms;
import java.awt.*;
import java.awt.event.*;

public class MyText extends Frame implements ActionListener{

	TextField name,password;
	
	MyText(){
		setLayout(new FlowLayout());
		Label n = new Label("Name: ",Label.LEFT);
		Label p = new Label("Password",Label.LEFT);
		
		name = new TextField(20);
		password = 	new TextField(20);
		password.setEchoChar('*');
		
		name.setBackground(Color.yellow);
		name.setForeground(Color.red);
		Font f = new Font("Arial",Font.PLAIN,25);
		
		add(n);
		add(name);
		add(p);
		add(password);
		
		name.addActionListener(this);
		password.addActionListener(this);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyText Mt = new MyText();
		Mt.setTitle("My Text Window");
		Mt.setSize(400,400);
		Mt.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Graphics g = this.getGraphics();
		g.drawString("Name: "+name.getText(),10,200 );
		g.drawString("Password: "+password.getText(),10,240);
	}

}
