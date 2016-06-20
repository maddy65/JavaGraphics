package SwingPgms;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
public class JtreeDemo extends JFrame implements TreeSelectionListener{

	JTree tree;
	Container c;
	String msg = "";
	JTextArea ta;
	DefaultMutableTreeNode root,dir1,dir2, file1,file2,file3;
	
	JtreeDemo(){
		c = getContentPane();
		c.setLayout(new BorderLayout());
		root = new DefaultMutableTreeNode("C:\\");
		// Create other notes
		
		dir1 = new DefaultMutableTreeNode("Java Programms");
		dir2 = new DefaultMutableTreeNode("Other Programms");
		file1 = new DefaultMutableTreeNode("ButtonDemo.java");
		file2 = new DefaultMutableTreeNode("CheckRadio.java");
		file3 = new DefaultMutableTreeNode("xyz.c");
		root.add(dir1);
		dir1.add(file1);
		dir1.add(file2);
		dir1.add(dir2);
		dir2.add(file3);
		tree = new JTree(root);
		c.add("North", tree);
		ta = new JTextArea();
		c.add("South",ta);
		
		tree.addTreeSelectionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JtreeDemo td = new JtreeDemo();
		td.setSize(500,500);
		td.setVisible(true);
	}

	@Override
	public void valueChanged(TreeSelectionEvent tse) {
		// TODO Auto-generated method stub
		TreePath tp = tse.getNewLeadSelectionPath(); 
		msg += "\n Path of selected component = "+tp;
		Object comp = tp.getLastPathComponent();
		msg += "\n Component Selected = "+comp;
		int n = tp.getPathCount();
		msg+= "\n Level of component = "+n;
		ta.setText(msg);
		msg = "";
	}

}
