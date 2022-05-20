import java.util.Scanner;
public class Pyramid {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<(n-i);j++) {
				System.out.print(" ");
			}
			for(int k=0;k<(2*i+1);k++) {
				System.out.print("*");
			}
			for(int m=0;m<(2*n-1)/2;m++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
	
}
