package cn.haohaowo.stu4;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class CalcultorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorFrame frame = new CalculatorFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show();
	}

}

class CalculatorFrame extends JFrame
{
	private static final int WIDTH = 300;
	private static final int HEIGHT = 200;
	
	public CalculatorFrame()
	{
		setTitle("¼ÆËãÆ÷");
		setSize(this.WIDTH,this.HEIGHT);
		
		Container container = getContentPane();
		CalculatorPanel panel = new CalculatorPanel();
		container.add(panel);
	}
}

class CalculatorPanel extends JPanel
{
	private JTextField display;
	private JPanel panel;
	private double result;
	private double tempresult;
	private String lastCommand;
	private String tempCommand;
	private boolean start;
	private int i=0,j=0;
	
	public CalculatorPanel()
	{
		setLayout(new BorderLayout());
		
		result = 0;
		lastCommand = "=";
		start = true;
		
		display = new JTextField("0");
		display.setEditable(false);
		add(display,BorderLayout.NORTH);
		
		ActionListener insert = new InsertAction();
		ActionListener command = new CommandAction();
		ActionListener control = new ControlAction();
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(5,5));
		
		addButton("7",insert);
		addButton("8",insert);
		addButton("9",insert);
		addButton("/",command);
		
		addButton("4",insert);
		addButton("5",insert);
		addButton("6",insert);
		addButton("*",command);
		
		addButton("1",insert);
		addButton("2",insert);
		addButton("3",insert);
		addButton("-",command);
		
		addButton("0",insert);
		addButton(".",insert);
		addButton("=",command);
		addButton("+",command);
		
		addButton("CE",control);
		addButton("backup",control);
		addButton("1/x",control);
		
		add(panel,BorderLayout.CENTER);
	}
	private void addButton(String label,ActionListener listener)
	{
		JButton button = new JButton(label);
		button.addActionListener(listener);
		panel.add(button);
	}
	
	private class InsertAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String input = e.getActionCommand();
			if(start)
			{
				display.setText("");
				start = false;
			}
			display.setText(display.getText()+input);
//			System.out.println(display.getText());
//			System.out.println("a"+(++i));
			
		}
	}
	private class CommandAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String command = e.getActionCommand();
			tempCommand = lastCommand;
//			tempresult = result;
			if(start)
			{
				if(command.equals("-")&&!tempCommand.equals("1/x"))
				{
					display.setText(command);
					start = false;
				}
				else if(command.equals("=")&&tempCommand.equals("="))
				{
					lastCommand = tempCommand;
					calculate(tempresult);
				}
				else
					lastCommand = command;
			}
			else
			{
				calculate(Double.parseDouble(display.getText()));
				tempresult = Double.parseDouble(display.getText());
				lastCommand = command;
				start = true;
//				System.out.println(display.getText());
//				System.out.println("b"+(++j));
			}
		}
	}
	private void calculate(double d)
	{
		if(lastCommand.equals("+")) result += d;
		else if(lastCommand.equals("*")) result *= d;
		else if(lastCommand.equals("-")) result -= d;
		else if(lastCommand.equals("/")) result /= d;
		else if(lastCommand.equals("=")) result = d;
		else if(lastCommand.equals("1/x")) result = 1/d;
		display.setText(""+result);
	}
	private class ControlAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String control = e.getActionCommand();
			if(control.equals("CE"))
			{
				result = 0;
				lastCommand = "=";
				start = true;
				display.setText("0.0");
			}
			if(control.equals("backup"))
			{
				if(!display.getText().equals("0.0"))
				{
					backup();
				}
//				System.out.println("a");
				if(display.getText().equals(""))
				{
					result = 0;
					lastCommand = "=";
					start = true;
					display.setText("0.0");
				}	
			}
			if(control.equals("1/x"))
			{
				lastCommand = "1/x";
				calculate(Double.parseDouble(display.getText()));
				start = true;
			}
		}
	}
	private void backup()
	{
		String str = display.getText();
		if(!str.equals(""))
		{
			char[] c = str.toCharArray();
			char[] temp = new char[c.length-1];
			for(int i=0;i<c.length-1;i++)
			{
				temp[i] = c[i];
			}
			str = new String(temp);
			display.setText(str);
		}
	}
}