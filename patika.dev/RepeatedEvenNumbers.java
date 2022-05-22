import java.util.Random;
import java.util.Scanner;


public class RepeatedEvenNumbers {
    public static void main(String[] args) {
    	Scanner scanner =new Scanner(System.in);
    	Random random=new Random();
        System.out.println("Enter element number:");
        int n=scanner.nextInt();
    	int[] array=new int[n];
    	for(int i=0;i<n;i++) {
    		array[i]=random.nextInt(n+1);
    	}
    	int sayac=0;
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<n;j++) {
        		if(array[i]==array[j]) {
        			sayac++;
        		}
        	}
    		if((array[i]%2==0)&&sayac>1) {
    			System.out.println(array[i]+"is repeated for "+sayac+" times.");
    		}
    		sayac=0;
    	}
    }
}


