package prob1;

public class Game369 {
	public static void main(String[] args){
		for(int i=1; i<100; i++){
			String number = String.valueOf(i);
			int length = number.length();
			int n = 0;
			if (length==1){
				char c = number.charAt(0);
				if(c=='3'||c=='6'||c=='9') n++;
			}
			else if(length==2){
				char c1 = number.charAt(0);
				char c2 = number.charAt(1);
				if (c1=='3'||c1=='6'||c1=='9') n++;
				if (c2=='3'||c2=='6'||c2=='9') n++;
			}
			if(n==1){
				System.out.println(number+" 짝");
			}
			else if(n==2){
				System.out.println(number+" 짝짝");
			}
			
		}
		
	}
//	public static void main(String[] args) {
//		int[] a = new int[2];
//		for(int i=0; i<10; i++){
//			a[0] = i;
//			for(int j=0; j<10; j++){
//				a[1] = j;
//				check(a);
//			}
//		}
//	}
//	public static void check(int[] a){
//		int n = 0;
//		if(a[0]==3 || a[0]==6 || a[0]==9) n++;
//		if(a[1]==3 || a[1]==6 || a[1]==9) n++;
//		if(n==1){
//			System.out.print(a[0]+""+a[1]+" ");
//			System.out.println("짝");
//		}
//		else if(n==2){
//			System.out.print(a[0]+""+a[1]+" ");
//			System.out.println("짝짝");
//		}
//	}
}
