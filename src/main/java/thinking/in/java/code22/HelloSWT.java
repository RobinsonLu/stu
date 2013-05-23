package thinking.in.java.code22;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;


public class HelloSWT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Hi there. SWT");
		Button button = new Button(shell, SWT.PUSH);
		button.setBounds(200, 200, 500, 500);
		button.setText("button");
		button.setSize(200, 200);
		shell.open();
		while(!shell.isDisposed()) {
			if(!display.readAndDispatch()) {
				display.sleep();
			}
			
		}
		display.dispose();
	}

}
