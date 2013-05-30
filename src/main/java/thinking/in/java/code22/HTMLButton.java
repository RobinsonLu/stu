package thinking.in.java.code22;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HTMLButton extends JFrame {

	private JButton b = new JButton("<html><b><font size=+2><center>Hello!<br><i>Press me now!");
	public HTMLButton() {
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				add(new JLabel("<html><i><font size=+4>Kapow!"));
				validate();
			}
		});
		setLayout(new FlowLayout());
		add(b);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new HTMLButton(), 200, 500);
	}

}
