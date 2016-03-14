package prob2;

public class Sub extends Arith {

	@Override
	public void calculate() {
		System.out.print(">>");
		System.out.println(super.a-super.b);
	}

}
