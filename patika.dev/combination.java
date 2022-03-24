import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 'n':");
        int n=input.nextInt();
        System.out.println("Enter 'r':");
        int r=input.nextInt();

        int n_fact=1,r_fact=1,n_r_fact=1;
        for(int i=n;i>0;i--){
            n_fact*=i;
        }
        for(int i=r;i>0;i--){
            r_fact*=i;
        }
        for(int i=n-r;i>0;i--){
            n_r_fact*=i;
        }

        System.out.println("Combination of n and r:"+n_fact/(r_fact*n_r_fact));

    }

}
