import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=x.nextInt();

        for(int i=1;i<=n;i++){

            System.out.print(fibo(i)+" ");

        }
    }


    public static int fibo(int n){

        if(n<2)
            return 1;
        else
            return fibo(n-1)+fibo(n-2);

    }
}
