package SwingPgms;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class MenuExt extends JFrame implements ActionListener  {

	JMenuBar mb;
	JMenu file,edit,font;
	JMenuItem op,sa,cl,cp,pt,f1,f2;
	JCheckBoxMenuItem pr;
	MenuExt(){
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		mb = new JMenuBar();
		c.add(mb);
		file = new JMenu();
		edit = new JMenu();
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
		// TODO Auto-generated method stub
		MenuExt ME = new MenuExt();
		ME.setTitle("Menu");
		ME.setSize(600,600);
		ME.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(op.isArmed()) this.openFile();
		//if(sa.isArmed()) this.saveFile();
		if(cl.isArmed()) System.out.println("Close is selected");
		if(cp.isArmed()) System.out.println("Copy is selected");
		if(pt.isArmed()) System.out.println("Paste is selected");
		if(f1.isArmed()) System.out.println("Arial font is selected");
		if(f2.isArmed()) System.out.println("Times Roman is selected");
	}
	void openFile() {
		// TODO Auto-generated method stub
		JFileChooser fc  = new JFileChooser();
		int i = fc.showOpenDialog(this);
		if(i == JFileChooser.APPROVE_OPTION){
			File f = fc.getSelectedFile();
			String fname = f.getPath();
			OpenFrame of = new OpenFrame(fname);
			of.setSize(400,400);
			of.setVisible(true);
			
		}
	}
	

}
