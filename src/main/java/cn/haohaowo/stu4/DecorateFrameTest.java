package cn.haohaowo.stu4;
import javax.swing.*;
import java.awt.*;

public class DecorateFrameTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlankFrame1 frame = new BlankFrame1();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show();
	}

}

class BlankFrame1 extends JFrame
{
	private static final int WIDTH = 300;
	private static final int HEIGHT = 400;
	
	public BlankFrame1()
	{
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - this.WIDTH)/2;
		int y = (height - this.HEIGHT)/2;
		setLocation(x,y);
		setSize(this.WIDTH,this.HEIGHT);
		Image image = kit.getImage("src/pics/woshou.gif");
		setIconImage(image);
		setTitle("Ok");
		setResizable(false);
	}
}