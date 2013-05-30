package cn.haohaowo.stu4;
import java.awt.BorderLayout;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayoutDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ButtonFrame1 frame = new ButtonFrame1();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class ButtonFrame1 extends JFrame
{
	private JPanel buttonPanel = new JPanel();
	private static final int WIDTH = 200;
	private static final int HEIGHT = 200;
	private JPanel panel = new JPanel();
	
	public ButtonFrame1()
	{
		setTitle("FlowLayoutDemo");
		setSize(this.WIDTH,this.HEIGHT);
		
		JButton yellow = new JButton("yellow");
		JButton red = new JButton("red");
		JButton black = new JButton("black");
		JButton orange = new JButton("orange");
		JButton gray = new JButton("gray");
		Container con = getContentPane();
		
		BorderLayout bl = new BorderLayout();
		panel.setLayout(bl);
		bl.setVgap(100);
		bl.setHgap(100);
		panel.add(yellow,BorderLayout.EAST);
		panel.add(red,BorderLayout.SOUTH);
		panel.add(black,BorderLayout.NORTH);
		panel.add(orange,BorderLayout.CENTER);;
		panel.add(gray,BorderLayout.WEST);
//		buttonPanel.add(yellow);
//		buttonPanel.add(red);
//		buttonPanel.add(black);
//		buttonPanel.add(orange);;
//		buttonPanel.add(gray);
		con.add(buttonPanel.add(panel));
		
		
		ColorAction yellowAction = new ColorAction(Color.yellow);
		ColorAction redAction = new ColorAction(Color.red);
		ColorAction blackAction = new ColorAction(Color.black);
		ColorAction orangeAction = new ColorAction(Color.orange);
		ColorAction grayAction = new ColorAction(Color.gray);
		
		yellow.addActionListener(yellowAction);
		red.addActionListener(redAction);
		black.addActionListener(blackAction);
		orange.addActionListener(orangeAction);
		gray.addActionListener(grayAction);
	}
	private class ColorAction implements ActionListener
	{
		private Color backgroundColor ;
		
		public ColorAction(Color c)
		{
			this.backgroundColor = c; 
		}
		public void actionPerformed(ActionEvent e)
		{
			panel.setBackground(backgroundColor);
		}
	}
}
