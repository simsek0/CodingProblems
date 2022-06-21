
public class inheri {

	public static void main(String[] args) {
		
		Human hum=new Boy();
		hum.eat();
		
	}
	
	
	
}
class Human{
	
	public void eat()
	{
		System.out.println("Human is eating");
	}
}

class Boy extends Human
{
	@Override
	public void eat()
	{
		System.out.println("Boy is eating");
	}
}
