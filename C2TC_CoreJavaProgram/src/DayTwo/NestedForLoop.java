package DayTwo;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int st=10;
		int end=20;

		for (int i = st; i <= end; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "*" + j + "= " + i * j);
			}
			System.out.println();

		}
	}

}
