package thinking.in.java.code14;

public class SimpleProxy implements Interface {

	private Interface proxied;
	public SimpleProxy(Interface proxied){
		this.proxied = proxied;
	}
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("SimpleProxy dosomething");
		proxied.doSomething();
	}

	public void somethingElse(String arg) {
		// TODO Auto-generated method stub
		System.out.println("SimpleProxy somethingElse " + arg);
		proxied.somethingElse(arg);
	}

}
