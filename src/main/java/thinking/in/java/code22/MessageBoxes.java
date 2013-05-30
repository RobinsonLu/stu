package thinking.in.java.code22;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MessageBoxes extends JFrame {

	private JButton[] b = {
			new JButton("Alert"), new JButton("Yes/No"), new JButton("Color"),
			new JButton("Input"), new JButton("3 Vals")
	};
	private JTextField txt = new JTextField(15);
	private ActionListener al = new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String id = ((JButton)e.getSource()).getText();
			if(id.equals("Alert")){
				JOptionPane.showMessageDialog(null, "There's a bug on you!", "Hey", JOptionPane.ERROR_MESSAGE);
			}else if(id.equals("Yes/No")){
				JOptionPane.showConfirmDialog(null, "or no", "choose yes", JOptionPane.YES_NO_OPTION);
			}else if(id.equals("Color")){
				Object[] options = {"Red", "Green"};
				int sel = JOptionPane.showOptionDialog(null, "Choose a color!", "warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
				if(sel != JOptionPane.CLOSED_OPTION){
					txt.setText("Color Selected: " + options[sel]);
				}
			}else if(id.equals("Input")){
				String val = JOptionPane.showInputDialog("How many fingers do you see?");
				txt.setText(val);
			}else if(id.equals("3 Vals")){
				Object[] selections = {"First", "Second", "Thrid"};
				Object val = JOptionPane.showInputDialog(null, "Choose one", "Input", JOptionPane.INFORMATION_MESSAGE, null, selections, selections[0]);
				if(val != null){
					txt.setText(val.toString());
				}
			}
		}
	};
	public MessageBoxes(){
		setLayout(new FlowLayout());
		for (int i = 0; i < b.length; i++) {
			b[i].addActionListener(al);
			add(b[i]);
		}
		add(txt);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new MessageBoxes(), 200, 200);
	}

}
