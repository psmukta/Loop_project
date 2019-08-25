package innerOuterLoopPack1;

public class InnerOuterLoopClass1 {

	public static void main(String[] args) {
		/*for(int i=1; i<=10; i=i+1) {
		System.out.println(i+". USA");
		for(int j=1; j<=5; j=j+1) {
			System.out.println("  "+j+". New York");
		}//inner loop
	}//Outer Loop
		 */		 		
		for(int i=1; i<=10; i=i+1) {
			System.out.println(i);
			for(int j=1; j<=i; j=j+1) {
				System.out.print(j);
			}
		}
		for(int i=10; i>=1; i=i-1) {
			System.out.println(i);
			for(int j=1; j<=i; j=j+1) {
				System.out.print(j);
			}
		}
		//i<= name.length is not correct;length is 7 but java start 0.
		String  name="Parveen";
		
		for(int i=0;i<name.length();i++) {
			
			System.out.println("\n char : "+name.charAt(i));
		}
		
			String  nam="Parveen";
		
		for(int i=nam.length()-1; i>=0;i--) {
			
			System.out.println("\n char : "+nam.charAt(i));
		}

		/*for(int i=1; i<=50000; i=i+1) {
		System.out.println(i+". COCACOLA");
		Thread.sleep(2000);

	}*/
		/*for(int i=1; i<=10; i=i+1) {
		System.out.println(i+". USA");
		System.out.println(i+". New York");
	}*/
		/*for(int i=1; i<=10; i=i+1) {
		if(i%2!=0) {
			System.out.println(i+". USA");
		}
		else if(i%2==0){
			System.out.println(i+". New York");
		}
	}//for loop
		 */	
	}//main
}//class





