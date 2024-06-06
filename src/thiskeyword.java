
public class thiskeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human1 = new Human();
		human1.setname("Virat");
		human1.setage(45);
		human1.info();
		System.out.println("My name is "+human1.getname()+ "\nI am "+human1.getage());
	}

}

class Human{
	private String name;   //This is an instance variable
	private int age;		//This is an instance variable
	
	public void setname(String name) {
		this.name = name;    //this keyword will point out to the instance variable. Using "this" keyword, we can distinguish between the 2 variables with same name
	}
	public String  getname() {
		return name;
	}

	public void setage(int age) {
		this.age = age;
	}
	public int  getage() {
		return age;
	}

	public void info() {
		System.out.println("ESCN");
	}

}