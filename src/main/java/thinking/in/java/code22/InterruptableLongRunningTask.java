package thinking.in.java.code22;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InterruptableLongRunningTask extends JFrame {

	private JButton b1 = new JButton("Start Long Running Task");
	private JButton b2 = new JButton("End Long Running Task");
	ExecutorService executor = Executors.newSingleThreadExecutor();
	public InterruptableLongRunningTask() {
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Task task = new Task();
				executor.execute(task);
				System.out.println(task + " added to the queue");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				executor.shutdownNow();
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
		SwingConsole.run(new InterruptableLongRunningTask(), 200, 150);
	}

}

class Task implements Runnable {
	private static int counter = 0;
	private final int id = counter++;
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this + " started");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch(InterruptedException ex) {
			System.out.println(this + " interrupted");
		}
		System.out.println(this + "completed");
	}
	public String toString() { return "Task" + id; }
	public long id() { return id; }
}