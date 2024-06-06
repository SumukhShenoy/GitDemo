public class Helloworld {
	
	public static void main(String[] args){
		
		Person person1 = new Person();
		person1.name = "Ramesh";
		person1.age = 24;
		person1.ht = 123.562323;
		person1.speak();
		//System.out.println("My name is "+ person1.name +"\nMy age is "+ person1.age +  "\nMy height is "+person1.ht);	
	}
}

class Person{
	String name;
	int age;
	double ht;
	
	 void speak() {
		System.out.println("Heyyyy!"+ "\nMy name is "+ name +"\nMy age is "+ age +  "\nMy height is "+ht);
	}
}

