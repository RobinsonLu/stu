package cn.haohaowo.stu4;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;

public class Clock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JTextFieldFrame frame = new JTextFieldFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show();
	}

}


class JTextFieldFrame extends JFrame
{
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	public JTextFieldFrame()
	{
		setSize(this.WIDTH,this.HEIGHT);
		setTitle(" ±÷”");
		
		Container con = getContentPane();
		ClockPanel clockPanel = new ClockPanel();
		JTextFieldPanel textFieldPanel = new JTextFieldPanel(clockPanel);
		con.add(textFieldPanel,BorderLayout.SOUTH);
		con.add(clockPanel,BorderLayout.CENTER);
		while(true)
		try
		{
			Thread.sleep(1000);
			textFieldPanel.setClock();
			clockPanel.paintComponent(getGraphics());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class JTextFieldPanel extends JPanel
{
	private JTextField hourText;
	private JTextField minuteText;
	private ClockPanel clockPanel;
	private int hour;
	private int minute;
	private int second;
	
	public JTextFieldPanel(ClockPanel clockPanel)
	{
		this.clockPanel = clockPanel;
		hourText = new JTextField("00",3);
		minuteText = new JTextField("00",3);
		
		DocumentListener listener = new ClockListener();
		hourText.getDocument().addDocumentListener(listener);
		minuteText.getDocument().addDocumentListener(listener);
		
		add(hourText);
		add(minuteText);
	}
	public void setClock()
	{
		try
		{
//			hour = Integer.parseInt(hourText.getText().trim());
//			minute = Integer.parseInt(minuteText.getText().trim());
			Calendar cal = Calendar.getInstance();
			hour = Integer.valueOf(cal.get(Calendar.HOUR_OF_DAY)).intValue();
			minute = Integer.valueOf(cal.get(Calendar.MINUTE)).intValue();
			second = Integer.valueOf(cal.get(Calendar.SECOND)).intValue();
			
			clockPanel.setTime(hour,minute,second);
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
	}
	private class ClockListener implements DocumentListener
	{

		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		/* (non-Javadoc)
		 * @see javax.swing.event.DocumentListener#insertUpdate(javax.swing.event.DocumentEvent)
		 */
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			setClock();
		}

		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			setClock();
		}
		
	}
}

class ClockPanel extends JPanel
{
	private double seconds= 0;
	private double Radius = 100;
	private double Minute_Hand_Length = 0.8 * Radius;
	private double Hour_Hand_Length = 0.6 * Radius;
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		Ellipse2D circle = new Ellipse2D.Double(0,0,2*Radius,2*Radius);
		g2.draw(circle);
		
		double hourAngle = Math.toRadians(90 -360*seconds/(12*60));
		drawHand(g2,hourAngle,this.Hour_Hand_Length);
		
		double minuteAngle = Math.toRadians(90 - 360*seconds/60);
		drawHand(g2,minuteAngle,this.Minute_Hand_Length);
	}
	public void drawHand(Graphics2D g2,double angle,double handlength)
	{
		Point2D end = new Point2D.Double(Radius+handlength*Math.cos(angle),
				Radius - handlength*Math.sin(angle));
		Point2D center = new Point2D.Double(Radius,Radius);
		g2.draw(new Line2D.Double(center,end));
	}
	public void setTime(int h,int m,int s)
	{
		seconds = h * 60 *60 + m * 60 + s;
//		repaint();
	}
}