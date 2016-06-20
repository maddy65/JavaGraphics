package SwingPgms;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
public class OpenFrame extends JFrame{
	
	OpenFrame(String fname){
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		TextArea ta = new TextArea(22,60);
		c.add(ta);
		String str = "";
		String str1 = "";
		try{
			BufferedReader br = new BufferedReader(new FileReader(fname));
			while((str = br.readLine()) != null)
				str1 += str+"\n";
			ta.setText(str1);
			br.close();
		}catch (Exception e){
			
		}
	}
}
