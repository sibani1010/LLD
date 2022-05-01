
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Animal a = new Animal();
		a.name = "Dog";
		System.out.println(a.name);
		a.eat();
		a.run();
		
		Animal d = new Dog();
		d.eat();
		d.run();
		
		Dog e = new Dog();
		e.eat();
		e.run();
      
		
		Runnable r = new Animal();
		r.run();
        

	}

}
