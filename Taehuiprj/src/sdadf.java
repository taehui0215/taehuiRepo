import java.util.Scanner;

public class sdadf {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, c, d;
		int hap;
		
		System.out.printf("1��° ���ڸ� �Է��ϼ��� : ");
		a = s.nextInt();
		System.out.printf("2��° ���ڸ� �Է��ϼ��� : ");
		b = s.nextInt();
		System.out.printf("3��° ���ڸ� �Է��ϼ��� :");
		c = s.nextInt();
		System.out.printf("4��° ���ڸ� �Է��ϼ��� :");
		d = s.nextInt();
		hap = a+b+c+d;
		
		System.out.printf("�հ� ==> %d \n",hap);
	}
}