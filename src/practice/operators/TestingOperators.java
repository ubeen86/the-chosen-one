package practice.operators;

public class TestingOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = a++;
		
		System.out.println( "a add one " + a);
		System.out.println("a normal " + b);
		
		int c = 10;
		int d = c--;
		
		System.out.println("c subtract one " + c);
		System.out.println("c normal " + d);
		
		int e = 86;
		int f = -e;
		
		System.out.println("normal " + e);
		System.out.println("inverted " + f);
		
		int g = -27;
		int h = +g;
		System.out.println(g);
		System.out.println(h);
		
		int i = 2;
		int j = ~i;
		
		System.out.println("Binary is " + Integer.toBinaryString(i));
		System.out.println("Binary is " + Integer.toBinaryString(j));
		
		boolean q = false;
		boolean z = !q;
		
		System.out.println("Answer " + q);
		System.out.println("Inverted " + z);
		
		int k = 20 + 20;
		System.out.println("addition " + k);
		
		int l = 50 - 44;
		System.out.println("subtraction " + l);
		
		int m = 10 * 9;
		System.out.println("multiple" + m);
		
		int n = 20 / 5;
		System.out.println("division " + n);
		
		int o = 6 % 3;
		System.out.println("remainder " + o);
		
		int p =  10 <<2;
		int r =  10 >>2;
		
		System.out.println("Binary is p  " + Integer.toBinaryString(p));
		System.out.println("Binary is r " + Integer.toBinaryString(r));
		
		boolean s = 20 > 19;
		boolean t = 20 < 10;
	
		System.out.println("Grater than " + s);
		System.out.println("Less than " + t);
		
		boolean u = 86 <= 86;
		boolean v = 89 >= 100;
		
		System.out.println("Less than or equak to " + u);
		System.out.println("Grater than or equal to " + v);
		
		boolean w = "wtf" instanceof String; 
		System.out.println("instance " + w);

		boolean x = 25 == 25;
		System.out.println("equals =" + x);
		
		boolean inequal = 26 !=26;
		System.out.println("inequal output is:   " + inequal);
		
		boolean logic = s && t;
		System.out.println("Logic && Result   " + logic);
		
		boolean opp = s || t;
		System.out.println("logical or operator result:   " + opp);
		
		
	}

}
