package thinking.in.java.code22;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import cn.haohaowo.stu2.Action;

public class Menus extends JFrame {

	private String[] flavors = {
			"Chocolate", "Strawberry", "Vanilla Fudge Swirl", "Mint Chip",
			"Mocha Almond Fudge", "Rum Raisin", "Praline Cream", "Mud Pie"
	};
	private JTextField t = new JTextField("No flavor", 30);
	private JMenuBar mb1 = new JMenuBar();
	private JMenu f = new JMenu("File");
	private JMenu m = new JMenu("Flavors");
	private JMenu s = new JMenu("Safety");
	private JCheckBoxMenuItem[] safety = {new JCheckBoxMenuItem("Guard"), new JCheckBoxMenuItem("Hide")};
	private JMenuItem[] file = {new JMenuItem("Open")};
	private JMenuBar mb2 = new JMenuBar();
	private JMenu fooBar = new JMenu("fooBar");
	private JMenuItem[] other = {
			new JMenuItem("Foo", KeyEvent.VK_F), new JMenuItem("Bar", KeyEvent.VK_A),
			new JMenuItem("Baz")
	};
	private JButton b = new JButton("Swap Menus");
	class BL implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JMenuBar m = getJMenuBar();
			setJMenuBar(m == mb1 ? mb2 : mb1);
			validate();
		}
	}
	class ML implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JMenuItem target = (JMenuItem)e.getSource();
			String actionCommand = target.getActionCommand();
			if(actionCommand.equals("Open")){
				String s = t.getText();
				boolean chosen = false;
				for (String flavor : flavors) {
					if(s.equals(flavor)){
						chosen = true;
					}
				}
				if(!chosen){
					t.setText("Choose a flavor first!");
				}else{
					t.setText("Opening " + s + ". Mmm, mm!");
				}
			}
		}
	}
	class FL implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JMenuItem target = (JMenuItem)e.getSource();
			t.setText(target.getText());
		}
	}
	class Fool implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			t.setText("Foo selected");
		}
	}
	class Barl implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			t.setText("Bar selected");
		}
	}
	class Bazl implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			t.setText("Baz selected");
		}
	}
	class CMIL implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			JCheckBoxMenuItem target = (JCheckBoxMenuItem)e.getSource();
			String actionCommand = target.getActionCommand();
			if(actionCommand.equals("Guard")){
				t.setText("Guard the Ice Cream! Guarding is " + target.getState());
			}else{
				t.setText("Hide the Ice Cream! Is it hidden? " + target.getState());
			}
		}
	}
	public Menus(){
		ML ml = new ML();
		CMIL cmil = new CMIL();
		safety[0].setActionCommand("Guard");
		safety[0].setMnemonic(KeyEvent.VK_G);
		safety[0].addItemListener(cmil);
		safety[1].setActionCommand("Hide");
		safety[1].addItemListener(cmil);
		other[0].addActionListener(new Fool());
		other[1].addActionListener(new Barl());
		other[2].addActionListener(new Bazl());
		int n = 0;
		FL fl = new FL();
		for (String flavor : flavors) {
			JMenuItem mi = new JMenuItem(flavor);
			mi.addActionListener(fl);
			m.add(mi);
			if((n++ + 1) % 3 == 0){
				m.addSeparator();
			}
		}
		for (JCheckBoxMenuItem sfty : safety) {
			s.add(sfty);
		}
		s.setMnemonic(KeyEvent.VK_A);
		f.add(s);
		f.setMnemonic(KeyEvent.VK_F);
		for (int i = 0; i < file.length; i++) {
			file[i].addActionListener(ml);
			f.add(file[i]);
		}
		mb1.add(f);
		mb1.add(m);
		setJMenuBar(mb1);
		t.setEditable(false);
		add(t, BorderLayout.CENTER);
		b.addActionListener(new BL());
		b.setMnemonic(KeyEvent.VK_S);
		add(b, BorderLayout.NORTH);
		for (JMenuItem oth : other) {
			fooBar.add(oth);
		}
		fooBar.setMnemonic(KeyEvent.VK_B);
		mb2.add(fooBar);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new Menus(), 300, 200);
	}

}
