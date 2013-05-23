package thinking.in.java.code21;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DaemoThreadPoolExecutor extends ThreadPoolExecutor {

	public DaemoThreadPoolExecutor() {
		// TODO Auto-generated constructor stub
		super(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), new DaemonThreadFactory());
	}
}
