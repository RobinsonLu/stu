package thinking.in.java.code22;

import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class LookAndFeel extends JFrame {

	private String[] choices = "Eeny Meeny Minnie Mickey Moe Larry Curly".split(" ");
	private Component[] samples = {
			new JButton("JButton"), new JTextField("JTextField"), new JLabel("JLabel"),
			new JCheckBox("JCheckBox"), new JRadioButton("JRadio"), new JComboBox(choices),
			new JList(choices)
	};
	public LookAndFeel() {
		super("Look And Feel");
		setLayout(new FlowLayout());
		for (Component component : samples) {
			add(component);
		}
	}
	private static void usageError() {
		System.out.println("Usage: LookAndFeel [cross|system|motif]");
		System.exit(1);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if(args.length == 0) {
//			usageError();
//		}
		String[] arg = {"cross", "system", "motif"};
		if(arg[1].equals("cross")) {
			try {
				UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			} catch(Exception e) {
				e.printStackTrace();
			}
		} else if(arg[1].equals("system")) {
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch(Exception e) {
				e.printStackTrace();
			}
		} else if(arg[1].equals("motif")) {
			try {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			} catch(Exception e) {
				e.printStackTrace();
			}
		} else {
			usageError();
		}
		SwingConsole.run(new LookAndFeel(), 300, 300);
	}

}
