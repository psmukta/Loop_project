package innerOuterLoopPack1;

public class InnerOuter {

	public static void main(String[] arg) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

			for (int j = 1; j <= i; j = j + 1) {
				System.out.print(j);
			}
		}
			for (int i = 10; i >= 1; i--) {
				System.out.println(i);
			
		

		for (int j = 1; j <= i; j++) {
			System.out.print(j);
		}
	}

	}
}