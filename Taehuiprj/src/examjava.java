public class examjava {
	public static void main(String[] args) {
		int[][] aa = new int[3][4];
		int i, k;
		int val =1;
		
	 for (i = 0; i < 3; i++) {
		 for (k=0; k<4;k++) {
			 aa[i][k] = val;
			 val++;			 
		 }
	 }
	 
	 System.out.printf("aa[0][0]���� aa[2][3]���� ��� \n");
	 
	 for (i = 0; i < 3; i++) {
		 for (k=0; k<4 ; k++) {
			 System.out.printf("%3d ", aa[i][k]);
		 }
		 System.out.printf("\n");
		 }
	 }
}