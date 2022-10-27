package lambda;

@FunctionalInterface
interface IFIABS {
	int abs(int a);
}

public class TransfervALUE {
	public static void main(String[] args) {
		TransfervALUE objj = new TransfervALUE();
		objj.test();
	}

	public void test() {
		IFIABS obj1 = CABS::myabs;
		System.out.println(obj1.abs(-3));

		IFIABS obj2 = (int i) -> {
			if (i < 0)
				return (-1) * i;
			return i;
		};
		System.out.println(obj2.abs(-5));
	}
}

class CABS {
	public static int myabs(int x) {
		if (x < 0)
			return (-1) * x;
		return x;
	}
}