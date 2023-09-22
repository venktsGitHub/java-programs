package prime.com;

public class SorsterOrNot {

	public static void main(String[] args) {

		
		sortIt(new int[] {1,5,6,11,110});

	}

	private static void sortIt(int[] is) {
	
		int current=0;
		int pre=1;
		int dif=0;
		
		while(current < is.length && pre < is.length) {
		
			dif = is[pre]-is[current];
			
			if(dif<0)
			{
				System.out.println("NO");
				return;
			}
			
			current++;
		    pre++;
			
		}
		System.out.println("Yes");
	B c =new C();
		c.M1();
		
	}

}

interface A{
	void M1();
}

interface B{
	void M1();
}

class C implements A,B{

	@Override
	public void M1() {
		
		System.out.println("I am");
		
	}
	
}
