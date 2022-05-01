
public class Dog extends Animal implements Runnable{

	String name;
	
	
	@Override
	public void eat()
	{
		System.out.println("eat meat");
	}
	
	@Override
	public void run() {
		
		System.out.println("can run fast");
	}
	
	

}
