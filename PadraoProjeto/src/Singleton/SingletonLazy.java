package Singleton;

public class SingletonLazy {

private static SingletonLazy instancia;
	
	private SingletonLazy() {
		}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
	
	public void doSomething(){
		System.out.print("Doing something...");
	}
}
