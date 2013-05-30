package thinking.in.java.code22;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button1 extends JFrame {

	private JButton b1 = new JButton("Button 1");
	private JButton b2 = new JButton("Button 2");
	public Button1(){
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new Button1(), 200, 100);
	}

}
