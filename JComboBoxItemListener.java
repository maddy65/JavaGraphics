package SwingPgms;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxItemListener extends JFrame implements ItemListener {

	Container c;
	JComboBox box;
	JLabel lbl;
	JComboBoxItemListener(){
		c = getContentPane();
		setLayout(new FlowLayout());
		box = new JComboBox();
		box.addItem("India");
		box.addItem("America");
		box.addItem("Germany");
		box.addItem("Japan");
		box.addItem("France");
		
		box.setBounds(100,50,100,40);
		c.add(box);
		lbl = new JLabel();
		lbl.setBounds(100, 200, 200, 40);
		c.add(lbl);
		box.addItemListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JComboBoxItemListener JCl = new JComboBoxItemListener();
		JCl.setSize(600,600);
		JCl.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		// TODO Auto-generated method stub
		String str = (String)box.getSelectedItem();
		lbl.setText("You Selected : "+str);
	}

}
