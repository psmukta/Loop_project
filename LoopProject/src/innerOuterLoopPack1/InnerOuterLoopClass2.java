package innerOuterLoopPack1;
//inner loop will break but outer loop does'nt
public class InnerOuterLoopClass2 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i=i+1) {
			System.out.println(i);	
			
			for(int j=1;j<=i;j=j+1) {
				System.out.print(j);
			}
		}
		
		for(int i=10;i>=1;i=i-1) {
			System.out.println(i);	
			
			for(int j=1; j<=i; j=j+1) {
				System.out.print(j);
			}

		}
			/*for (int i = 1; i <= 10; i = i + 1) {
				for (int j = 1; j <= i; j = j + 1) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
			
			System.out.println("=== another one ===");
			
			for (int i = 10; i >= 1; i = i - 1) {
				for (int j = 1; j <= i; j = j + 1) {
					System.out.print(j+" ");
				}
				System.out.println();
			}*/	

	}

}
