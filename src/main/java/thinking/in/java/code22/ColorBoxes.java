package thinking.in.java.code22;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorBoxes extends JFrame {

	private int grid = 12;
	private int pasue = 50;
	private static ExecutorService exec = Executors.newCachedThreadPool();
	public void setUp() {
		setLayout(new GridLayout(grid, grid));
		for (int i = 0; i < grid * grid; i++) {
			CBox cb = new CBox(pasue);
			add(cb);
			exec.execute(cb);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorBoxes boxes = new ColorBoxes();
		if(args.length > 0) {
			boxes.grid = new Integer(args[0]);
		}
		if(args.length > 1) {
			boxes.pasue = new Integer(args[1]);
		}
		boxes.setUp();
		SwingConsole.run(boxes, 500, 400);
	}

}

class CBox extends JPanel implements Runnable {
	private int pause;
	private static Random rand = new Random();
	private Color color = new Color(0);
	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		Dimension s = getSize();
		g.fillRect(0, 0, s.width, s.height);
	}
	public void run() {
		try {
			while(!Thread.interrupted()){
				color = new Color(rand.nextInt(0xFFFFFF));
				repaint();
				TimeUnit.MILLISECONDS.sleep(pause);
			}
		} catch(InterruptedException e) {
			
		}
	}
	public CBox(int pause) { this.pause = pause; }
}