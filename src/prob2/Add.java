package prob2;

public class Add extends Arith {

	@Override
	public void calculate() {
		int sum = super.a + super.b;
		System.out.println(">>"+sum);
	}

}
