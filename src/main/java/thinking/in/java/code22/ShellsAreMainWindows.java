package thinking.in.java.code22;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ShellsAreMainWindows {

	
	static Shell[] shells = new Shell[10];
	static boolean shellsDisposed() {
		for(int i = 0; i < shells.length; i++) {
			if(shells[i].isDisposed()) {
				return true;
			}
		}
		return false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = new Display();
		for(int i = 0; i < shells.length; i++) {
			shells[i] = new Shell(display);
			shells[i].setText("Shell # " + i);
			shells[i].open();
		}
		
		while(!shellsDisposed()) {
			if(!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

}
