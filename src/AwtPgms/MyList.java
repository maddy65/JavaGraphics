package AWTPgms;
import java.awt.*;
import java.awt.event.*;

public class MyList extends Frame implements ItemListener {

	int [] msg;
	List lst;
	MyList(){
		setLayout(new FlowLayout());
		lst = new List(4,true);
		lst.add("Spanish");
		lst.add("Mandarin");
		lst.add("English");
		lst.add("German");
		lst.add("French");
		lst.add("Siberian");
		lst.add("African");
		lst.add("Latina");
		add(lst);
		lst.addItemListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList ml = new MyList();
		ml.setSize(360,360);
		ml.setTitle("List");
		ml.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}
	public void paint(Graphics g){
		g.drawString("Selected Language", 100, 200);
		msg = lst.getSelectedIndexes();
		for(int i=0; i<msg.length;i++){
			String item = lst.getItem(msg[i]);
			g.drawString(item, 100, 200+i*20);
		}
	}

}
