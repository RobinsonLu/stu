package thinking.in.java.code22;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayout1 extends JFrame {

	public FlowLayout1(){
		setLayout(new FlowLayout());
		for (int i = 0; i < 20; i++) {
			add(new JButton("Button" + i));
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new FlowLayout1(), 300, 300);
	}

}
