package SwingPgms;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyMenu extends JFrame implements ActionListener{
	JMenuBar mb;
	JMenu  file,edit,font;
	JMenuItem op,sa,cl,cp,pt,f1,f2;
	JCheckBoxMenuItem pr;
	
	MyMenu(){
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		mb = new JMenuBar();
		c.add("North", mb);
		file = new JMenu("File");
		edit = new JMenu("Edit");
		mb.add(file);
		mb.add(edit);
		
		op = new JMenuItem("Open");
		sa = new JMenuItem("Save");
		cl = new JMenuItem("Close");
		cp = new JMenuItem("Copy");
		pt = new JMenuItem("Paste");
		
		file.add(op);
		file.add(sa);
		file.add(cl);
		edit.add(cp);
		edit.add(pt);
		cl.setEnabled(false);
		
		pr = new JCheckBoxMenuItem("Print");
		file.add(pr);
		file.addSeparator();
		font = new JMenu("Font");
		file.add(font);
		f1 = new JMenuItem("Arial");
		f2 = new JMenuItem("Times New Roman");
		font.add(f1);
		font.add(f2);
		op.addActionListener(this);
		sa.addActionListener(this);
		cl.addActionListener(this);
		cp.addActionListener(this);
		pt.addActionListener(this);
		pr.addActionListener(this);
		f1.addActionListener(this);
		f2.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		MyMenu M1 = new MyMenu();
		M1.setSize(500, 500);
		M1.setVisible(true);
		M1.setTitle("My Menu");
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(op.isArmed()) System.out.println("Open is selected");
		if(sa.isArmed()) System.out.println("Save is selected");
		if(cl.isArmed()) System.out.println("Close is selected");
		if(cp.isArmed()) System.out.println("Open is selected");
		if(pr.getModel().isSelected()) System.out.println("Printing on ...");
		else System.out.println("Printing off ...");
		if(f1.isArmed()) System.out.println("Arial font is selected");
		if(f2.isArmed()) System.out.println("Times Roman is selected");
		
	}

}
