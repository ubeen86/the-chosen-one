package practice.primitives;

public class ExampleOne {

	public static void main(String[] args) {
		String string = new String("This is a String");
		System.out.println(string +" :) " + "Welcome to Coding!");
		
		String test = "This is Shorthand. " + string;
		System.out.println(test);
		
		int k = 86; //primitive
		Integer f = 43; //object
		System.out.println(k);
		System.out.println(f);
		
		int t;
		t = 365; //initialization
		System.out.println(t);
		
		final int p = 186;//locked in at the set value
		System.out.println(p);
		
		int x = 5;
		
		double g = (double) x / 2;
		System.out.println(g);
		
		double z = x / 2;
		System.out.println(z);
		
		int r = 50 % 10;
		System.out.println("equals= " + r);
		
		k++;
		System.out.println(k);
		
		k--;
		System.out.println(k);
		
		int h = ++x;
		System.out.println(h);
		
		int c = --x;
		System.out.println(c);

		
		int a = 7;
		int b = 2;
		System.out.println("a is" + a);
		System.out.println("b is" + b);
		b *= a++;
		System.out.println("b is now " + b);
		
		int fu = 7%2;
		System.out.println(fu);
		
		
		
		
		
		
		
		
		
		//boolean result = false;
		//char capitalK = 'K';
		//int i = 86;
		//double d1 = 8.6;
		//System.out.printf("boolean = %b%n",result);
		//System.out.printf("char = %c%n", capitalK);
		//System.out.printf("int = %d%n", i);
		//System.out.printf("double = %5.2f%n",d1);
		
		//Table Head
		//System.out.printf("%n%8s%12s%11s%14s%n","Name","Gender","Job","Age");
		//Kevin
		//System.out.printf("%n%8s%11s%16s%10s%n","Kevin","Male","Machine Op",25);
		//Alex
		//System.out.printf("%n%7s%12s%16s%10s%n","Alex","Male","Accountant",25);
		//Steven
		//System.out.printf("%n%9s%10s%13s%13s%n","Steven","Male","DJ Taco",27);
		//Tiffani
		//System.out.printf("%n%10s%11s%9s%15s%n","Tiffani","Female","Coder",22);
		//Debbie
		//System.out.printf("%n%9s%12s%11s%13s%n","Debbie","Female","Manager",30);
		
		

	}

}
