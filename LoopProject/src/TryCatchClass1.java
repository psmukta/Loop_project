
public class TryCatchClass1 {

	public static void main(String[] args) {
		int a=50;
		int b=0;
		int c=a/b;
		try {
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally{
			System.out.println("final");
			
		}

	}

}
