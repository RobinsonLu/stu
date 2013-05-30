package thinking.in.java.code22;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Faces extends JFrame {

	private static Icon[] faces;
	private JButton jb, jb2 = new JButton("Disable");
	private boolean mad = false;
	public Faces(){
		faces = new Icon[]{
			new ImageIcon("src/pics/p_1.gif"),
			new ImageIcon("src/pics/p_2.gif"),
			new ImageIcon("src/pics/p_3.gif"),
			new ImageIcon("src/pics/p_4.gif"),
			new ImageIcon("src/pics/p_5.gif")
		};
		jb = new JButton("JButton", faces[3]);
		setLayout(new FlowLayout());
		jb.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(mad){
					jb.setIcon(faces[3]);
					mad = false;
				}else{
					jb.setIcon(faces[0]);
					mad = true;
				}
				jb.setVerticalAlignment(JButton.TOP);
				jb.setHorizontalAlignment(JButton.LEFT);
			}
		});
		jb.setRolloverEnabled(true);
		jb.setRolloverIcon(faces[1]);
		jb.setPressedIcon(faces[2]);
		jb.setDisabledIcon(faces[4]);
		jb.setToolTipText("Yow!");
		add(jb);
		jb2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(jb.isEnabled()){
					jb.setEnabled(false);
					jb2.setText("Enable");
				}else{
					jb.setEnabled(true);
					jb2.setText("Disable");
				}
			}
		});
		add(jb2);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new Faces(), 250, 125);
	}

}
