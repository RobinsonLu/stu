package thinking.in.java.code22;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import net.mindview.util.Generator;
import net.mindview.util.RandomGenerator;

public class TextPane extends JFrame {
	private JButton b = new JButton("Add Text");
	private JTextPane tp = new JTextPane();
	private static Generator sg = new RandomGenerator.String(7);
	public TextPane(){
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for (int i = 0; i < 5; i++) {
					tp.setText(tp.getText() + sg.next() + "\n");
				}
			}
		});
		add(new JScrollPane(tp));
		add(BorderLayout.SOUTH, b);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new TextPane(), 475, 425);
	}

}
