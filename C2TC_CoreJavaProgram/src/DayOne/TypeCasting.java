package DayOne;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 10;
		int i = b;
		System.out.println(i);
		
		float f = 22.14f;
		double d = f;
		System.out.println(d);
		
		char ch1 = 'A';
		int i3 = ch1;
		System.out.println(i3);
		
		char var = '\u00A7';
		int i4 = var;
		System.out.println(i4);
		

		double f1 = 10.52f;
		long l = (long) f1;
		System.out.println(l);

		long l1 = 923372036854775806l;
		int i2 = (int) l1;
		System.out.println(i2);

		float f2 = 34.56f;
		int i1 = (int) f2;
		System.out.println(i1);

		byte b1 = 90;
		char ch2 = (char) b1;
		System.out.println(ch2);

	}

}
