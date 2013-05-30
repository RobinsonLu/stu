package cn.haohaowo.stu2;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;

public class TestSleep {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame();
		frame.setTitle("Time");
		Label label = new Label();
		frame.add(label);
		frame.addWindowListener(new WindowAdapter()
		{
			@SuppressWarnings("unused")
			public void WindowClosing(WindowEvent event)
			{
				System.exit(1);
			}
		});
		frame.pack();
		frame.setVisible(true);
		while(true)
		{
			Calendar cal = Calendar.getInstance();
			String str1 = cal.get(Calendar.YEAR)+":"+(cal.get(Calendar.MONTH)+1)+":"+cal.get(Calendar.DAY_OF_MONTH);
			String str2 = cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND);
			label.setText(str1+"  "+str2);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
