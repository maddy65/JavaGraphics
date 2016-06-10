package AWTPgms;
import java.awt.*;
public class MyFrame2 extends Frame {

	MyFrame2(String str){
		super(str);
	}
	public static void main(String[] args) {
		
		MyFrame2 f = new MyFrame2("Hello");
		f.setSize(500,500);
		f.setVisible(true);

	}

}
