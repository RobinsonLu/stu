package cn.haohaowo.stu4;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo extends JFrame{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("FrameDemo");
		frame.setBackground(new Color(122,144,22));
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter()
		{
			public void WindowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		frame.setSize(400,300);
		frame.setLocation(400,300);
		
		try
		{
			Thread.sleep(3000);
			frame.setBounds(0, 0, 100, 50);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
