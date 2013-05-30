package thinking.in.java.code14;

import java.util.Date;

public class Mixins {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mixin mixin1 = new Mixin();
		Mixin mixin2 = new Mixin();
		mixin1.set("test string 1");
		mixin2.set("test string 2");
		System.out.println(mixin2.get() + " " + mixin2.getStamp() + " " + mixin2.getSerialNumber());
		System.out.println(mixin1.get() + " " + mixin1.getStamp() + " " + mixin1.getSerialNumber());
	}

}

interface TimeStamped {
	long getStamp();
}
class TimeStampedImpl implements TimeStamped {
	private final long timeStamp;
	public TimeStampedImpl() {
		timeStamp = new Date().getTime();
	}
	@Override
	public long getStamp() {
		return timeStamp;
	}
}
interface SerialNumbered {
	long getSerialNumber();
}
class SerialNumberImpl implements SerialNumbered {
	private static long counter = 1;
	private final long serialNumber = counter++;
	@Override
	public long getSerialNumber() {
		return serialNumber;
	}
}
interface Basic {
	public void set(String val);
	public String get();
}
class BasicImpl implements Basic {
	private String value;
	@Override
	public void set(String val) {
		value = val;
	}
	@Override
	public String get() {
		return value;
	}
}
class Mixin extends BasicImpl implements TimeStamped, SerialNumbered {
	private TimeStamped timeStamp = new TimeStampedImpl();
	private SerialNumbered serialNumber = new SerialNumberImpl();
	@Override
	public long getStamp() {
		return timeStamp.getStamp();
	}
	@Override
	public long getSerialNumber() {
		return serialNumber.getSerialNumber();
	}
}