package Singleton;

public class Test {

	public static void main(String[] args) {
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		
		lazy.doSomething();
	}
}
