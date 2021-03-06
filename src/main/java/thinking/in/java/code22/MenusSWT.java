package thinking.in.java.code22;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

import thinking.in.java.code18.TextFile;


public class MenusSWT implements SWTApplication {

	private static Shell shell;
	public void createContents(Composite parent) {
		shell = parent.getShell();
		Menu bar = new Menu(shell, SWT.BAR);
		shell.setMenuBar(bar);
		Set<String> words = new TreeSet<String>(new TextFile("src/thinking/in/java/code22/MenusSWT.java", "\\W+"));
		Iterator<String> it = words.iterator();
		while(it.next().matches("[0-9]+")) {
			
		}
		
		MenuItem[] mItem = new MenuItem[7];
		for(int i = 0; i < mItem.length; i++) {
			mItem[i] = new MenuItem(bar, SWT.CASCADE);
			mItem[i].setText(it.next());
			Menu submenu = new Menu(shell, SWT.DROP_DOWN);
			mItem[i].setMenu(submenu);
		}
		int i = 0;
		while(it.hasNext()) {
			addItem(bar, it, mItem[i]);
		}
	}
	
	private void addItem(Menu bar, Iterator<String> it, MenuItem menuItem) {
		MenuItem item = new MenuItem(menuItem.getMenu(), SWT.PUSH);
		item.addListener(SWT.SELECTED, listener);
		item.setText(it.next());
	}

	static Listener listener = new Listener() {
		
		public void handleEvent(Event e) {
			System.out.println(e.toString());
		}
	};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SWTConsole.run(new MenusSWT(), 600, 200);
	}

}
