import java.util.Scanner;
public class ex9 {

	public static void main(String[] args) {
		
		double tc;
		double tf;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Fahreheit:");
		
		tf = sc.nextDouble();
		
		sc.close();
		
		tc = 5 * ((tf-32)/9);
		
		System.out.println("A temperatura em Celsius é : " + tc);
		
		

		
		
		

	}

}
