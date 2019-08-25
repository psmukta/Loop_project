package innerOuterLoopPack1;

public class InnerOuterLoop {

	public static void main(String[] args) throws InterruptedException {
		for(int i=1; i<=100; i=i+1) {
			System.out.println(i+".usa");
			for (int j=1;j<=3;j=1+j) {
				System.out.println( " " +j+".nj");
			}
		}
		
		for (int i=1; i<=50; i=i+1) {
			System.out.println( i+".sprite");
			Thread.sleep(3000 );
			
		}

	}

}
