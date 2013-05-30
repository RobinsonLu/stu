package cn.haohaowo.stu4;

import java.awt.*;

import javax.swing.*;

public class BoxLayoutTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxLayoutFrame frame = new BoxLayoutFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show();
	}

}

class BoxLayoutFrame extends JFrame
{
	private static final int WIDTH = 300;
	private static final int HEIGHT = 200;
	
	public BoxLayoutFrame()
	{
		setTitle("BoxLayoutFrame Test");
		setSize(this.WIDTH,this.HEIGHT);
		
		Container con = getContentPane();
		
		JLabel label1 = new JLabel("姓名");
		JTextField textField1 = new JTextField(10);
		textField1.setMaximumSize(textField1.getPreferredSize());
		
		Box hbox1 = Box.createHorizontalBox();
		hbox1.add(label1);
		hbox1.add(Box.createHorizontalStrut(20));
		hbox1.add(textField1);
		
		JLabel label2 = new JLabel("密码");
		JTextField textField2 = new JTextField(10);
		textField2.setMaximumSize(textField2.getPreferredSize());
		
		Box hbox2 = Box.createHorizontalBox();
		hbox2.add(label2);
		hbox2.add(Box.createHorizontalStrut(20));
		hbox2.add(textField2);
		
		JButton button1 = new JButton("确定");
		JButton button2 = new JButton("取消");
		
		Box hbox3 = Box.createHorizontalBox();
		hbox3.add(Box.createHorizontalStrut(40));
		hbox3.add(button1);
		hbox3.add(Box.createHorizontalGlue());
		hbox3.add(button2);
		hbox3.add(Box.createHorizontalStrut(40));
		
		Box vbox = Box.createVerticalBox();
		vbox.add(hbox1);
		vbox.add(hbox2);
		vbox.add(Box.createVerticalGlue());
		vbox.add(hbox3);
		
		con.add(vbox,BorderLayout.CENTER);
	}
}