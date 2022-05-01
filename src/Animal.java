
public class Animal implements Runnable{
       
	
	
	
	String name;
	
	
	public void eat()
	{
		System.out.println("eat everything");
	}


	@Override
	public void run() {
		
		System.out.println("can run");
		
	}
	
}
