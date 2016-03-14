package prob2;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		while(true){
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			if(input.equals("quit")){
				break;
			}
			String[] list = input.split(" ");
			int a = Integer.valueOf(list[0]);
			String token = list[1];
			int b = Integer.valueOf(list[2]);
			switch (token){
				case "+":
					Add add = new Add();
					add.setValue(a, b);
					add.calculate();
					break;
				case "-":
					Sub sub = new Sub();
					sub.setValue(a, b);
					sub.calculate();
					break;
				case "*":
					Mul mul = new Mul();
					mul.setValue(a, b);
					mul.calculate();
					break;
				case "/":
					Div div = new Div();
					div.setValue(a, b);
					div.calculate();
					break;
				default:
					System.out.println("Syntax error");
					break;
			}
			
	}
	}
	
}
