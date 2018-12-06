package shiva;

public class TestDogDemo {

	public static void main(String[] args) {
		DogOwner ow=new DogOwner();
		boolean xyz=ow.Takeforwalk();
		System.out.println("Dog needs to walk   :"+xyz);
		
		DogOwner ow1=new DogOwner();
		boolean xyz1=ow1.Takeforwalk1();
		System.out.println("Dog needs to walk   :" +xyz1);
		
		/*Dog  ob3 = new Dog();
		ob3.setDrinkTime(4);
		boolean value2 = ob3.needsTogo(); 
		DogOwner ow1 = new DogOwner();
		boolean qwe = ow1.Takeforwalk();
		System.out.println("dogowner walk  "+qwe);
		*/

	}

}
