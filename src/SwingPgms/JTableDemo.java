package SwingPgms;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;
import java.util.*;

public class JTableDemo extends JFrame {

	JTableDemo(){
		Vector<Vector> data = new Vector<Vector>();
		Vector<String> row = new Vector<String>();
		
		row.add("Rama Rao");
		row.add(" Analysit");
		row.add("22000");
		row.add("India");
		data.add(row);
		row = new Vector<String>();
		row.add("Sam");
		row.add("SE");
		row.add("56222");
		row.add("England");
		data.add(row);
		row.add("Rama Rao");
		row.add(" Analysit");
		row.add("22000");
		row.add("India");
		data.add(row);
		row = new Vector<String>();
		row.add("Sam");
		row.add("SE");
		row.add("56222");
		row.add("England");
		data.add(row);
		
		Vector <String> col = new Vector<String>();
		col.add("Name");
		col.add("Job");
		col.add("Salary");
		col.add("Country");
		
		JTable tab = new JTable(data,col);
		tab.setBorder(BorderFactory.createLineBorder(Color.black,2));
		tab.setFont(new Font("Arial",Font.BOLD,20));
		tab.setRowHeight(30);
		tab.setGridColor(Color.gray);
		JTableHeader head = tab.getTableHeader();
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add("North", head);
		c.add("Center", tab);
		
	}
	public static void main(String[] args) {
		
		JTableDemo jt = new JTableDemo();
		jt.setSize(600,600);
		jt.setVisible(true);
		//demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
