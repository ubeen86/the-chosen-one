package practice.loop;

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k = 0; k<21; k++) {
			if( k%2==1 ) {
					continue;
			}

			
			System.out.println(k);
		}
	}
}
