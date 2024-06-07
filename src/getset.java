
public class getset {

	public static void main(String[] args) {
		People person1 = new People();
		person1.setname("Rahul");
		person1.setage(45);
		System.out.println("My name is "+ person1.getname()+"\nMy age is "+person1.getage());
	}
}

class People{
	private String loginname;  				//Cannot be accessed in main class
	private int age;
	
	public void setname(String name) {     //U can make changes to this class and main class doesn't get to know the changes.
		loginname = name;
	}
	public String getname() {
		return loginname;
	}
	
	public void setage(int userAge) {
		age = userAge;
	}
	public int getage() {
		return age;
	}
	 {
		 System.out.println("Heyyyy!"+ "\nMy name is Sumukh");
		 System.out.println("Lets merge to master!");
	 }

}
