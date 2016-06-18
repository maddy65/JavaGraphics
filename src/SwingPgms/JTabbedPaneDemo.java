package SwingPgms;
import java.awt.*;
import javax.swing.*;
public class JTabbedPaneDemo extends JFrame {

	JTabbedPaneDemo(){
		Container c = getContentPane();
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("Capitals",new CapitalsPanel());
		jtp.addTab("Countries", new CountriesPanel());
		c.add(jtp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JTabbedPaneDemo demo = new JTabbedPaneDemo();
		demo.setTitle("TabExapmle");
		demo.setSize(400,400);
		demo.setVisible(true);
	}
	

}
