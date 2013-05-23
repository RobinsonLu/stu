package thinking.in.java.code22;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dialogs extends JFrame {

	private JButton b1 = new JButton("Dialog Box");
	private MyDialog dlg = new MyDialog(null);
	public Dialogs() {
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dlg.setVisible(true);
			}
		});
		add(b1);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new Dialogs(), 125, 75);
	}

}

class MyDialog extends JDialog {
	public MyDialog(JFrame parent) {
		super(parent, "My dialog", true);
		setLayout(new FlowLayout());
		add(new JLabel("Here is my dialog"));
		JButton ok = new JButton("OK");
		ok.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		add(ok);
		setSize(150, 125);
	}
}