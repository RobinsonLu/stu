package thinking.in.java.code22;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FileChooserTest extends JFrame {

	private JTextField fileName = new JTextField();
	private JTextField dir = new JTextField();
	private JTextField colorT = new JTextField();
	private JButton open = new JButton("Open");
	private JButton save = new JButton("Save");
	private JButton color = new JButton("Color");
	public FileChooserTest() {
		JPanel p = new JPanel();
		open.addActionListener(new OpenL());
		p.add(open);
		save.addActionListener(new SaveL());
		p.add(save);
		color.addActionListener(new ColorL());
		p.add(color);
		add(p, BorderLayout.SOUTH);
		dir.setEnabled(false);
		fileName.setEditable(false);
		p = new JPanel();
		p.setLayout(new GridLayout(3, 1));
		p.add(fileName);
		p.add(dir);
		p.add(colorT);
		add(p, BorderLayout.NORTH);
	}
	class OpenL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JFileChooser c = new JFileChooser();
			int rVal = c.showOpenDialog(FileChooserTest.this);
			if(rVal == JFileChooser.APPROVE_OPTION) {
				fileName.setText(c.getSelectedFile().getName());
				dir.setText(c.getCurrentDirectory().toString());
			}
			if(rVal == JFileChooser.CANCEL_OPTION) {
				fileName.setText("You pressed cancel");
				dir.setText("");
			}
		}
	}
	class SaveL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JFileChooser c = new JFileChooser();
			int rVal = c.showSaveDialog(FileChooserTest.this);
			if(rVal == JFileChooser.APPROVE_OPTION) {
				fileName.setText(c.getSelectedFile().getName());
				dir.setText(c.getCurrentDirectory().toString());
			}
			if(rVal == JFileChooser.CANCEL_OPTION) {
				fileName.setText("You pressed cancel");
				dir.setText("");
			}
		}
	}
	class ColorL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			JColorChooser c = new JColorChooser();
			Color color = c.showDialog(FileChooserTest.this, "Color", Color.RED);
			if(null == color) {
				color = Color.RED;
			}
			colorT.setText(color.toString());
			fileName.setBackground(color);
			
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new FileChooserTest(), 250, 150);
	}

}
