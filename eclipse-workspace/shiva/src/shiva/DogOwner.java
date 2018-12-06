package shiva;

public class DogOwner  {
	//Dog.setDrinkTime();
	/*Dog  obj = new Dog();
	int aval=obj.setDrinkTime(4);
	boolean value1 = obj.needsTogo();*/
			
	public Boolean Takeforwalk()
	{
		Dog  obj = new Dog();
	obj.setDrinkTime(3);
	boolean value1 = obj.needsTogo();
	return value1;
	
	}
	public Boolean Takeforwalk1()
	{
	Dog  obj1 = new Dog();
	obj1.setDrinkTime(9);
	boolean value2 = obj1.needsTogo();
	return value2;
		
	}
	
}
