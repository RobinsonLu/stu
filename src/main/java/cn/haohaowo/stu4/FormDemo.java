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
		
		JLabel name = new JLabel("�û���:");
		JTextField name1 = new JTextField(18);
		
		JLabel password = new JLabel("����:");
		JTextField password1 = new JTextField(18);
		
		JLabel sex = new JLabel("�Ա�:");
		JRadioButton button1 = new JRadioButton("��");
		JRadioButton button2 = new JRadioButton("Ů");
		ButtonGroup buttongroup = new ButtonGroup();
		buttongroup.add(button1);
		buttongroup.add(button2);
		
		JLabel kong = new JLabel("\t\t\t\t\t");
		JLabel honeys = new JLabel("��Ȥ����:");
		JCheckBox honey1 = new JCheckBox("������Ӱ");
		JCheckBox honey2 = new JCheckBox("������");
		JCheckBox honey3 = new JCheckBox("���");
		
		JLabel introduce = new JLabel("���:");
		JTextArea introduce1 = new JTextArea(5,15);
		
		JButton submit = new JButton("�ύ");
		JButton reset = new JButton("ȡ��");
		
		JFrame mainframe = new JFrame("��");
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
