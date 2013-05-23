package thinking.in.java.code21;

public class MultiLock {

	public synchronized void f1(int count){
		if(count-- > 0){
			System.out.println("f1() calling f2() with count " + count);
			f2(count);
		}
	}
	
	public synchronized void f2(int count){
		if(count-- > 0){
			System.out.println("f2() calling f1() count " + count);
			f1(count);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final MultiLock multiLock = new MultiLock();
		new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				multiLock.f1(10);
			}
		}.start();
	}

}
