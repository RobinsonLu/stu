package thinking.in.java.code22;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

import net.mindview.util.DaemonThreadPoolExecutor;

import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;

public class ColorBoxesSWT implements SWTApplication {

	private int grid = 12;
	private int pause = 50;
	
	public void createContents(Composite parent) {
		GridLayout gridLayout = new GridLayout(grid, true);
		gridLayout.horizontalSpacing = 0;
		gridLayout.verticalSpacing = 0;
		parent.setLayout(gridLayout);
		ExecutorService exec = new DaemonThreadPoolExecutor();
		for(int i = 0; i < (grid * grid); i++) {
			final CBoxSWT cb = new CBoxSWT(parent, pause);
			cb.setLayoutData(new GridData(GridData.FILL_BOTH));
			exec.execute(cb);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ColorBoxesSWT boxes = new ColorBoxesSWT();
		if(args.length > 0) {
			boxes.grid = new Integer(args[0]);
		}
		if(args.length > 1) {
			boxes.pause = new Integer(args[1]);
		}
		SWTConsole.run(boxes, 500, 400);
	}

}

class CBoxSWT extends Canvas implements Runnable {
	public CBoxSWT(Composite parent, int pause) {
		super(parent, SWT.NONE);
		this.pause = pause;
		addPaintListener(new CBoxPaintListener());
	}
	class CBoxPaintListener implements PaintListener {
		public void paintControl(PaintEvent e) {
			Color color = new Color(e.display, cColor);
			e.gc.setBackground(color);
			Point size = getSize();
			e.gc.fillRectangle(0, 0, size.x, size.y);
			color.dispose();
		}
	}
	private static Random rand = new Random();
	private static RGB newColor() {
		return new RGB(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
	}
	private int pause;
	private RGB cColor = newColor();
	public void run() {
		try {
			while(!Thread.interrupted()) {
				cColor = newColor();
				getDisplay().asyncExec(new Runnable() {
					
					public void run() {
						try {
							redraw();
						} catch(SWTException e) {
							
						}
					}
				});
				TimeUnit.MILLISECONDS.sleep(pause);
			}
		} catch(InterruptedException e) {
			
		} catch(SWTException e) {
			
		}
	}
}