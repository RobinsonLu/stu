package thinking.in.java.code22;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabbedPanel extends JFrame {

	private String[] flavors = {
			"Chocolate", "Strawberry", "Vanilla Fudge Swirl", "Mint Chip",
			"Mocha Almond Fudge", "Rum Raisin", "Praline Cream", "Mud Pie"
	};
	private JTabbedPane tabs = new JTabbedPane();
	private JTextField txt = new JTextField(20);
	public TabbedPanel(){
		int i = 0;
		for (String flavor : flavors) {
			tabs.addTab(flavors[i], new JButton("Tabbed pane " + i++));
		}
		tabs.addChangeListener(new ChangeListener() {
			
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				txt.setText("Tab selected: " + tabs.getSelectedIndex());
			}
		});
		add(BorderLayout.SOUTH, txt);
		add(tabs);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new TabbedPanel(), 400, 250);
	}

}
