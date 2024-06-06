public class inheritance {

	public static void main(String[] args) {
		
		Animals_inheritance animal = new Animals_inheritance();
		
		animal.eat();
		animal.sleep();
		System.out.println("---------------This is Inheritance!-----------------------");

		Tiger_inheritance tiger = new Tiger_inheritance();
		tiger.eat();
		tiger.sleep();
		tiger.roar();
		//tiger.info();  //Since int is in PRIVATE
	}

}
