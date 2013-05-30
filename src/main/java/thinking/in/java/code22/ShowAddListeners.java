package thinking.in.java.code22;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ShowAddListeners extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3138388292599794985L;
	private JTextField name = new JTextField(25);
	private JTextArea results = new JTextArea(40, 25);
	private static Pattern addListener = Pattern.compile("(add\\w+?Listener\\(.*?\\))");
	private static Pattern qualifier = Pattern.compile("\\w+\\.");
	class NameL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String nm = name.getText().trim();
			if(nm.length() == 0) {
				results.setText("No match");
				return ;
			}
			Class<?> kind;
			try{
				kind = Class.forName("javax.swing." + nm);
			}catch(ClassNotFoundException ex){
				results.setText("No match");
				return ;
			}
			Method[] methods = kind.getMethods();
			results.setText("");
			for (Method m : methods) {
				Matcher matcher = addListener.matcher(m.toString());
//				System.out.println(m.toString());
				if(matcher.find()){
					results.append(qualifier.matcher(matcher.group(1)).replaceAll("") + "\n");
				}
			}
		}
	}
	public ShowAddListeners(){
		NameL nameListener = new NameL();
		name.addActionListener(nameListener);
		JPanel top = new JPanel();
		top.add(new JLabel("Swing class name (press Enter)"));
		top.add(name);
		add(BorderLayout.NORTH, top);
		add(new JScrollPane(results));
		name.setText("JTextArea");
		nameListener.actionPerformed(new ActionEvent("", 0, ""));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new ShowAddListeners(), 500, 400);
	}

}
