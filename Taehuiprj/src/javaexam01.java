import java.util.Scanner;

public class javaexam01 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a, b;
		
	while (true) {
		System.out.println("더할첫번째 수 입력 : ");
		a = s.nextInt();
		System.out.println("더할두번째 수 입력 : ");
		b = s.nextInt();
		
		System.out.printf("%d + %d = %d \n" , a, b, a+b);
		}
	
	}
}