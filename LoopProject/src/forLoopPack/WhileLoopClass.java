package forLoopPack;

public class WhileLoopClass {

	public static void main(String[] args) {
		//sum of 1 to 10 numbers
		int x=1,sum=0;
		while(x<=10) {
			sum=sum+x;
			x++;
		}
		System.out.println(sum);


		for(int i=1;i<=5;i++) {
			System.out.println(i);
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
		}

		for(int i=5;i>=1;i--) {
			System.out.println(i);
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}	
		}
	}
}


