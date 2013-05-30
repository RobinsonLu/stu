package cn.haohaowo.stu4;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class FormDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanel panel = new JPanel();
		
		JLabel name = new JLabel("用户名:");
		JTextField name1 = new JTextField(18);
		
		JLabel password = new JLabel("密码:");
		JTextField password1 = new JTextField(18);
		
		JLabel sex = new JLabel("性别:");
		JRadioButton button1 = new JRadioButton("男");
		JRadioButton button2 = new JRadioButton("女");
		ButtonGroup buttongroup = new ButtonGroup();
		buttongroup.add(button1);
		buttongroup.add(button2);
		
		JLabel kong = new JLabel("\t\t\t\t\t");
		JLabel honeys = new JLabel("兴趣爱好:");
		JCheckBox honey1 = new JCheckBox("爱看电影");
		JCheckBox honey2 = new JCheckBox("听音乐");
		JCheckBox honey3 = new JCheckBox("逛街");
		
		JLabel introduce = new JLabel("简介:");
		JTextArea introduce1 = new JTextArea(5,15);
		
		JButton submit = new JButton("提交");
		JButton reset = new JButton("取消");
		
		JFrame mainframe = new JFrame("表单");
		mainframe.setSize(300,400);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.setVisible(true);
		mainframe.pack();
		
		panel.add(name);
		panel.add(name1);
		panel.add(password);
		panel.add(password1);
		panel.add(button1);
		panel.add(button2);
		panel.add(kong);
		panel.add(honeys);
		panel.add(honey1);
		panel.add(honey2);
		panel.add(honey3);
		panel.add(introduce);
		panel.add(introduce1);
		panel.add(submit);
		panel.add(reset);
		
		mainframe.add(panel);
		
		mainframe.addWindowListener(new WindowAdapter()
		{
			public void WindowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}

}
