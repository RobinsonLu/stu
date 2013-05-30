package cn.haohaowo.stu4;
import javax.swing.*;

public class BlankFrameTest{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlankFrame frame = new BlankFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show();
	}

}

class BlankFrame extends JFrame
{
	private static final int WIDTH = 300;
	private static final int HEIGHT = 400;
	
	public BlankFrame()
	{
		setSize(this.WIDTH,this.HEIGHT);
	}
}