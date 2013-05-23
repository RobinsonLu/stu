package thinking.in.java.code22;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import thinking.in.java.code21.NotifyVsNotifyAll;

public class BangBean2 extends JPanel implements Serializable {

	private int xm, ym;
	private int cSize = 20;
	private String text = "Bang!";
	private int fontSize = 48;
	private Color tColor = Color.RED;
	private List<ActionListener> actionListeners = new ArrayList<ActionListener>();
	public BangBean2() {
		addMouseListener(new ML());
		addMouseMotionListener(new MM());
	}
	
	public synchronized int getCircleSize() { return cSize; }
	public synchronized void setCircleSize(int newSize) { cSize = newSize; }
	public synchronized String getBangText() { return text; }
	public synchronized void setBangText(String newText) { text = newText; }
	public synchronized int getFontSize() { return fontSize; }
	public synchronized void setFontSize(int newSize) { fontSize = newSize; }
	public synchronized Color getTextColor() { return tColor; }
	public synchronized void setTextColor(Color newColor) { tColor = newColor; }
	
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(Color.BLACK);
		g.drawOval(xm - cSize / 2, ym - cSize / 2, cSize, cSize);
	}
	
	public synchronized void addActionListener(ActionListener l) {
		actionListeners.add(l);
	}
	
	public synchronized void removeActionListener(ActionListener l) {
		actionListeners.remove(l);
	}
	
	public void notifyListeners() {
		ActionEvent a = new ActionEvent(BangBean2.this, ActionEvent.ACTION_PERFORMED, null);
		List<ActionListener> lv = null;
		synchronized(this) {
			lv = new ArrayList<ActionListener>(actionListeners);
		}
		for (ActionListener actionListener : lv) {
			actionListener.actionPerformed(a);
		}
	}
	
	class ML extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			Graphics g = getGraphics();
			g.setColor(tColor);
			g.setFont(new Font("TimesRoman", Font.BOLD, fontSize));
			int width = g.getFontMetrics().stringWidth(text);
			g.drawString(text, (getSize().width - width) / 2, getSize().height / 2);
			g.dispose();
			notifyListeners();
		}
	}
	
	class MM extends MouseMotionAdapter {
		@Override
		public void mouseMoved(MouseEvent e) {
			xm = e.getX();
			ym = e.getY();
			repaint();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BangBean2 bb2 = new BangBean2();
		bb2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent " + e);
			}
		});
		bb2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("BangBean2 action");
			}
		});
		bb2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("More action");
			}
		});
		JFrame frame = new JFrame();
		frame.add(bb2);
		SwingConsole.run(frame, 300, 300);
	}

}
