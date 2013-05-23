package thinking.in.java.code22;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class SimpleMenus extends JFrame {

	private JTextField t = new JTextField(15);
	private ActionListener al = new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			t.setText(((JMenuItem)e.getSource()).getText());
		}
	};
	private JMenu[] menus = {
			new JMenu("Winken"), new JMenu("Blinken"), new JMenu("Nod")
	};
	private JMenuItem[] items = {
			new JMenuItem("Fee"), new JMenuItem("Fi"), new JMenuItem("Fo"),
			new JMenuItem("Zip"), new JMenuItem("Zap"), new JMenuItem("Zot"),
			new JMenuItem("Olly"), new JMenuItem("Oxen"), new JMenuItem("Free")
	};
	public SimpleMenus(){
		for (int i = 0; i < items.length; i++) {
			items[i].addActionListener(al);
			menus[i % 3].add(items[i]);
		}
		JMenuBar mb = new JMenuBar();
		for (JMenu jm : menus) {
			mb.add(jm);
		}
		setJMenuBar(mb);
		setLayout(new FlowLayout());
		add(t);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new SimpleMenus(), 200, 150);
	}

}
