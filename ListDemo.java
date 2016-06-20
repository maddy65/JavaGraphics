package SwingPgms;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListDemo extends JFrame implements ListSelectionListener{
	JList JL;
	JLabel lbl;
	Object arr[];
	String msg = "";
	ListDemo(){
		Container c = getContentPane();
		c.setLayout(null);
		String items [] = {"India", "France", "America", "Germany", "Japan", "Singapore"};
		JL = new JList(items);
		JL.setBounds(100,50,100,100);
		c.add(JL);
		lbl = new JLabel();
		lbl.setBounds(50, 200, 400, 70);
		c.add(lbl);
		JL.addListSelectionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		ListDemo LD = new ListDemo();
		LD.setTitle("My Combo List");
		LD.setSize(400,400);
		LD.setVisible(true);

	}
	@Override
	public void valueChanged(ListSelectionEvent le) {
		// TODO Auto-generated method stub
		arr = JL.getSelectedValues();
		for(int i=0; i<arr.length; i++){
			msg+= (String)arr[i];
			lbl.setText("Selected: "+msg);
			msg="";
		}
	}

}
