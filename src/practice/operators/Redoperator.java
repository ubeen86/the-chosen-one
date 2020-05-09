package practice.operators;

public class Redoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		a += 10;
		System.out.println("add " + a);
		
		int b = 10;
		b -= 5;
		System.out.println("sub " + b);
		
		int c = 10;
		c *= 10;
		System.out.println("mult " + c);
		
		int d = 10;
		d /= 2;
		System.out.println("div " + d);
		
		int e = 10;
		e %= 4;
		System.out.println("rem " + e);
		
		int f = 10;
		System.out.println("Binary f is " + Integer.toBinaryString(f));
		f &= 2;
		System.out.println("Binary f is now " + Integer.toBinaryString(f));
		
		int g = 10;
		System.out.println("Binary g is " + Integer.toBinaryString(g));
		g ^= 2;
		System.out.println("Binary g is now " + Integer.toBinaryString(g));
		
		int h = 10;
		System.out.println("Binary h is " + Integer.toBinaryString(h));
		h |= 2;
		System.out.println("Binary h is now " + Integer.toBinaryString(h));
		
		int i = 10;
		System.out.println("Binary i is " + Integer.toBinaryString(i));
		i <<= 2;
		System.out.println("Binary i is now " + Integer.toBinaryString(i));
		
		int j = 10;
		System.out.println("Binary j is " + Integer.toBinaryString(j));
		j >>= 2;
		System.out.println("Binary j is now " + Integer.toBinaryString(j));
		
		int k = 10;
		System.out.println("Binary k is " + Integer.toBinaryString(k));
		k >>>= 2;
		System.out.println("Binary k is now " + Integer.toBinaryString(k));
		
		int l = 10;
		int m = 12;
		System.out.println("L is " + Integer.toBinaryString(l));
		System.out.println("M is " + Integer.toBinaryString(m));
		System.out.println( "& is " + Integer.toBinaryString(l & m));
		System.out.println( "|is " + Integer.toBinaryString(l |m));
		System.out.println( "^ is " + Integer.toBinaryString(l ^ m));
		System.out.println( "~ is " + Integer.toBinaryString(~m));

	}

}
