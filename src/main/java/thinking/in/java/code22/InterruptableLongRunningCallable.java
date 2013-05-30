package thinking.in.java.code22;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Callable;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InterruptableLongRunningCallable extends JFrame {

	private JButton b1 = new JButton("Start Long Running Task");
	private JButton b2 = new JButton("End Long Running Task");
	private JButton b3 = new JButton("Get results");
	private TaskManager<String, CallableTask> manager = new TaskManager<String, CallableTask>();
	public InterruptableLongRunningCallable() {
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CallableTask task = new CallableTask();
				manager.add(task);
				System.out.println(task + " added to the queue");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for (String result : manager.purge()) {
					System.out.println(result);
				}
			}
		});
		b3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for (TaskItem<String, CallableTask> tt : manager) {
					tt.task.id();
				}
				for (String result : manager.getResults()) {
					System.out.println(result);
				}
			}
		});
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new InterruptableLongRunningCallable(), 200, 150);
	}

}

class CallableTask extends Task implements Callable<String> {
	public String call() throws Exception {
		// TODO Auto-generated method stub
		run();
		return "Return value of " + this;
	}
}