package thinking.in.java.code22;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LongRunningTask extends JFrame {

	private JButton b1 = new JButton("Start Long Running Task");
	private JButton b2 = new JButton("End Long Running Task");
	public LongRunningTask() {
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					TimeUnit.SECONDS.sleep(3);
				} catch(InterruptedException ex) {
					System.out.println("Task Interrupted");
					return ;
				}
				System.out.println("Task completed");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Thread.currentThread().interrupt();
			}
		});
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new LongRunningTask(), 200, 150);
	}

}
