
public class Arrays {

	public static void main(String[] args) {
		 int a[] = {1,2,3,4,5,6,7,8,9};
		 System.out.println(a[2]);
		 for (int i= 0; i<a.length; i++) {
			System.out.println(i);
		}
		System.out.println(a.length);
		
		String z[] = new String[3];
		z[0]="Apple";
		z[1]="Mango";
		z[2]="Orange";
		
		System.out.println(z[1]);
		
		// TODO Auto-generated method stub
		
		String animals[]  = {"Cat", "dog", "pig", "tiger", "elephant"};
		for (String animal:animals) {
			System.out.println(animal);
		}
		int c[] = {12,13,14,15};
		for (int b:c) {
			System.out.println(b);
		}
		
		int table [][] = {{1,2,3},{4,5,6},{7,8,9}}; //multidimensional array
		System.out.println(table[0][2]);
		
		int numbers[][]= {  //iterating through array
			{1,2,3},
			{4,5,6},
			{7,8,9}};
		for (int i=0;i<table.length;i++) {
			for(int j =0;j<table.length;j++) {
				System.out.print(numbers[i][j]+ "");
				
			}
			}
		System.out.println();
		
		}
	}
