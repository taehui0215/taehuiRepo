import java.util.Scanner;

public class javaexam01 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a, b;
		
	while (true) {
		System.out.println("����ù��° �� �Է� : ");
		a = s.nextInt();
		System.out.println("���ҵι�° �� �Է� : ");
		b = s.nextInt();
		
		System.out.printf("%d + %d = %d \n" , a, b, a+b);
		}
	
	}
}