package thinking.in.java.code21;

public class ResponsiveUI extends Thread {

	private static volatile double d = 1;
	public ResponsiveUI() {
		// TODO Auto-generated constructor stub
		setDaemon(true);
		start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			d = d + (Math.PI + Math.E) / d;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		new ResponsiveUI();
		System.in.read();
		System.out.println(d);
	}

}

class UnresponsiveUI{
	private volatile double d = 1;
	public UnresponsiveUI() throws Exception{
		// TODO Auto-generated constructor stub
		while(d > 0){
			d = d + (Math.PI + Math.E) / d;
		}
		System.in.read();
	}
}