package thinking.in.java.code22;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.Serializable;
import java.util.TooManyListenersException;

import javax.swing.JPanel;

public class BangBean extends JPanel implements Serializable {

	private int xm, ym;
	private int cSize = 20;
	private String text = "Bang";
	private int fontSize = 48;
	private Color tColor = Color.RED;
	private ActionListener actionListener;
	public BangBean() {
		addMouseListener(new ML());
		addMouseMotionListener(new MML());
	}
	public int getCircleSize() { return cSize; }
	public void setCircleSize(int newSize) { cSize = newSize; }
	public String getBeanText() { return text; }
	public void setBangText(String newText) { text = newText; }
	public int getFontSize() { return fontSize; }
	public void setFontSize(int newSize) { fontSize = newSize; }
	public Color getTextColor() { return tColor; }
	public void setTextColor(Color newColor) { tColor = newColor; }
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(Color.BLACK);
		g.drawOval(xm - cSize / 2, ym - cSize / 2, cSize, cSize);
	}
	public void addActionListener(ActionListener l) throws TooManyListenersException {
		if(actionListener != null) {
			throw new TooManyListenersException();
		}
		actionListener = l;
	}
	public void removeActionListener(ActionListener l) {
		actionListener = null;
	}
	class ML extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			Graphics g = getGraphics();
			g.setColor(tColor);
			g.setFont(new Font("TimesRoman", Font.BOLD, fontSize));
			int width = g.getFontMetrics().stringWidth(text);
			g.drawString(text, (getSize().width) / 2, getSize().height / 2);
			g.dispose();
			if(actionListener != null) {
				actionListener.actionPerformed(new ActionEvent(BangBean.this, ActionEvent.ACTION_PERFORMED, null));
			}
		}
	}
	class MML extends MouseMotionAdapter {
		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			xm = e.getX();
			ym = e.getY();
			repaint();
		}
	}
	public Dimension getPreferredSize() { return new Dimension(200, 200); }
}
