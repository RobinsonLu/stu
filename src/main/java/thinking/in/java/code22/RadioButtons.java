package thinking.in.java.code22;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtons extends JFrame {

	private JTextField t = new JTextField("text", 10);
	private ButtonGroup g = new ButtonGroup();
	private JRadioButton rb1 = new JRadioButton("one", false);
	private JRadioButton rb2 = new JRadioButton("two", false);
	private JRadioButton rb3 = new JRadioButton("three", false);
	private ActionListener al = new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			t.setText("Radio button " + ((JRadioButton)e.getSource()).getText());
		}
	};
	public RadioButtons(){
		rb1.addActionListener(al);
		rb2.addActionListener(al);
		rb3.addActionListener(al);
		g.add(rb1);
		g.add(rb2);
		g.add(rb3);
		t.setEditable(false);
		setLayout(new FlowLayout());
		add(t);
		add(rb1);
		add(rb2);
		add(rb3);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new RadioButtons(), 300, 125);
	}

}
