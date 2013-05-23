package thinking.in.java.code22;

import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SubmitLabelManipulationTask {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Hello Swing");
		final JLabel label = new JLabel("A Label");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
		TimeUnit.SECONDS.sleep(1);
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				// TODO Auto-generated method stub
				label.setText("Hey! This is Different!");
			}
		});
	}

}
