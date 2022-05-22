public class Transpoze {
	public static void main(String[] args) {
		int[][] matrix= {
				{1,4,7},
				{2,3,5}};
		int[][] transpoze=new int[matrix[0].length][matrix.length];
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				transpoze[j][i]=matrix[i][j];
			}
		}
		for(int i=0;i<transpoze.length;i++) {
			for(int j=0;j<transpoze[0].length;j++) {
				System.out.print(transpoze[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
}

