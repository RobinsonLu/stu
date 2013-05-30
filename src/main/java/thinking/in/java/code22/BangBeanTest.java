package thinking.in.java.code22;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TooManyListenersException;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class BangBeanTest extends JFrame {

	private JTextField txt = new JTextField(20);
	class BBL implements ActionListener {
		private int count = 0;
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			txt.setText("BangBean action " + count++);
		}
	}
	public BangBeanTest() {
		BangBean bb = new BangBean();
		try {
			bb.addActionListener(new BBL());
		} catch(TooManyListenersException ex) {
			txt.setText("Too man listeners");
		}
		add(bb);
		add(BorderLayout.SOUTH, txt);
		setLayout(new FlowLayout());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new BangBeanTest(), 400, 500);
	}

}
