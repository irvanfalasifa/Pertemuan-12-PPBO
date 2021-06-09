package arrayMultiDimensions;

public class Matrices2Dimension {
	static int a [][] = {{1,3,4},{3,4,5}};
	static int b [][] = {{1,3,4},{3,4,5}};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMatrix();
		System.out.println("Adding Matrices : a + b\n");
		adding();
	}
	static void showMatrix() {
		int rep = 0;
		for(int i = 0; i<2 ; i++) { 
			if(i == 0)
				System.out.print("a = |");
			else
				System.out.print("    |");
			for(int j = 0; j<3 ; j++) {
				if(rep==0)
					System.out.print(" "+a[i][j]+" ");
				else if(rep==1)
					System.out.print(" "+b[i][j]+" ");
				if(j==2 && rep == 0) {
					System.out.print("|\t");
					if(i == 0)
						System.out.print("b = |");
					else
						System.out.print("    |");
					rep++;
					j=-1;
				}
			}
			System.out.println("|");
			rep = 0;
		}
		System.out.println();
	}
	static void adding() {
		int c [][] = {{0,0,0},{0,0,0}};
		for(int i=0;i<2;i++) {
			if(i == 0)
				System.out.print("c = |");
			else
				System.out.print("    |");
			for(int j = 0;j<3;j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(" "+c[i][j]+" ");
			}
			System.out.println("|");
		}
	}
}
