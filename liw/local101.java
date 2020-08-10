package week6;

public class local101 {
	String br =  "Black Diamod";
	static int age=10;
	static String cat ="Luca";
	
	public static void main(String[]args) {
		String owner ="Lisa";
		local101 obj = new local101();
		System.out.println("Cat name is:" + cat+"and Tommy is :"+owner);
		cat();
		obj.display();
	}
	public static void cat() {
		age=1;
		age=age+5;
		System.out.println(age);
	}
	
	public void display() {
		System.out.println(br);
	}
}
